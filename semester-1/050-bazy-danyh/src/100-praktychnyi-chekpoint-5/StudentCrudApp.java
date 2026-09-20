// ПРИКЛАД РОЗВ'ЯЗКУ ДЛЯ ВИКЛАДАЧА - консольний CRUD-застосунок для таблиці
// students. НЕ показувати студентам одразу - орієнтир по очікуваному обсягу
// й складності, що поєднує JDBC, Scanner, цикл з меню та обробку винятків
// з усього блоку 3 і 5.
//
// CRUD = Create, Read, Update, Delete - чотири базові операції з даними,
// які має вміти практично будь-який застосунок, що працює з базою даних.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentCrudApp {
    static final String URL = "jdbc:postgresql://localhost:5432/college_db";
    static final String USER = "postgres";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Показати всіх студентів");
            System.out.println("2. Додати студента");
            System.out.println("3. Оновити рік народження студента");
            System.out.println("4. Видалити студента");
            System.out.println("5. Вийти");
            System.out.print("Обери дію: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // "з'їдаємо" залишок рядка після nextInt() (пастка з блоку 1)

            switch (choice) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    System.out.print("Ім'я: ");
                    String name = scanner.nextLine();
                    System.out.print("Рік народження: ");
                    int birthYear = scanner.nextInt();
                    System.out.print("ID групи: ");
                    int groupId = scanner.nextInt();
                    addStudent(name, birthYear, groupId);
                    break;
                case 3:
                    System.out.print("Ім'я студента для оновлення: ");
                    String nameToUpdate = scanner.nextLine();
                    System.out.print("Новий рік народження: ");
                    int newBirthYear = scanner.nextInt();
                    updateBirthYear(nameToUpdate, newBirthYear);
                    break;
                case 4:
                    System.out.print("Ім'я студента для видалення: ");
                    String nameToDelete = scanner.nextLine();
                    deleteStudent(nameToDelete);
                    break;
                case 5:
                    running = false;
                    System.out.println("До зустрічі!");
                    break;
                default:
                    System.out.println("Немає такого пункту меню.");
            }
        }
    }

    // Read
    static void listStudents() {
        String sql = "SELECT name, birth_year, group_id FROM students ORDER BY name";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name")
                        + " (" + resultSet.getInt("birth_year") + "), група ID "
                        + resultSet.getInt("group_id"));
            }
        } catch (SQLException e) {
            System.out.println("Помилка читання даних: " + e.getMessage());
        }
    }

    // Create
    static void addStudent(String name, int birthYear, int groupId) {
        String sql = "INSERT INTO students (name, birth_year, group_id) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, name);
            statement.setInt(2, birthYear);
            statement.setInt(3, groupId);
            statement.executeUpdate();
            System.out.println("Студента додано.");
        } catch (SQLException e) {
            System.out.println("Помилка додавання: " + e.getMessage());
        }
    }

    // Update
    static void updateBirthYear(String name, int newBirthYear) {
        String sql = "UPDATE students SET birth_year = ? WHERE name = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, newBirthYear);
            statement.setString(2, name);
            int rowsUpdated = statement.executeUpdate();
            System.out.println("Оновлено рядків: " + rowsUpdated);
        } catch (SQLException e) {
            System.out.println("Помилка оновлення: " + e.getMessage());
        }
    }

    // Delete
    static void deleteStudent(String name) {
        String sql = "DELETE FROM students WHERE name = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, name);
            int rowsDeleted = statement.executeUpdate();
            System.out.println("Видалено рядків: " + rowsDeleted);
        } catch (SQLException e) {
            System.out.println("Помилка видалення: " + e.getMessage());
        }
    }
}
