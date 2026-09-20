// Керована практика: виконати SELECT-запит з Java і обробити результат.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
    static final String URL = "jdbc:postgresql://localhost:5432/college_db";
    static final String USER = "postgres";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        String sql = "SELECT name, birth_year FROM students ORDER BY name";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            // ResultSet - "курсор", що рухається по рядках результату запиту.
            // resultSet.next() повертає true, поки є ще один рядок, і
            // одразу переміщує курсор на нього.
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int birthYear = resultSet.getInt("birth_year");
                System.out.println(name + " (" + birthYear + ")");
            }
        } catch (SQLException e) {
            System.out.println("Помилка виконання запиту: " + e.getMessage());
        }
    }
}
