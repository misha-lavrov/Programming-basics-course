// Самостійний челендж: додавання даних з Java через PreparedStatement.
//
// ЧОМУ НЕ ПРОСТО ПІДСТАВИТИ ЗМІННІ В РЯДОК SQL (важливо для безпеки коду):
//
//     String sql = "INSERT INTO students (name) VALUES ('" + name + "')";
//
// Якщо значення name прийшло від користувача (наприклад, з форми на сайті)
// і хтось введе замість імені щось на кшталт:
//
//     Х', 2000, 1); DROP TABLE students; --
//
// то цей текст стане ЧАСТИНОЮ SQL-запиту і виконає довільну команду в базі
// даних - аж до видалення таблиці. Це називається SQL-ін'єкція (SQL
// injection) - одна з найпоширеніших і найнебезпечніших вразливостей
// реальних застосунків.
//
// PreparedStatement вирішує це: значення передаються ОКРЕМО від тексту
// запиту (через setString/setInt), і база даних сама гарантує, що вони
// сприймаються ЛИШЕ як дані, а не як частина SQL-коду.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement {
    static final String URL = "jdbc:postgresql://localhost:5432/college_db";
    static final String USER = "postgres";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        addStudent("Тарас Гончар", 2006, 2);
    }

    static void addStudent(String name, int birthYear, int groupId) {
        String sql = "INSERT INTO students (name, birth_year, group_id) VALUES (?, ?, ?)";
        // "?" - плейсхолдери, куди підставляться значення нижче - НЕ через
        // конкатенацію рядків.

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, name);
            statement.setInt(2, birthYear);
            statement.setInt(3, groupId);

            int rowsInserted = statement.executeUpdate();
            System.out.println("Додано рядків: " + rowsInserted);
        } catch (SQLException e) {
            System.out.println("Помилка додавання: " + e.getMessage());
        }
    }
}
