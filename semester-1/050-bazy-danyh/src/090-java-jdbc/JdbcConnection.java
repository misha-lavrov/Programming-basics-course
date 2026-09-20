// Демонстрація: перше підключення до бази даних з Java.
//
// ВАЖЛИВО перед запуском:
// 1. PostgreSQL має бути встановлений і запущений (заняття 030).
// 2. База college_db має існувати, зі схемою й даними з заняття 020.
// 3. У проєкті має бути підключений JDBC-драйвер PostgreSQL (у Maven/Gradle -
//    залежність org.postgresql:postgresql; у простому IntelliJ-проєкті без
//    системи збірки - .jar-файл драйвера додано в Project Structure -> Libraries).
// 4. Замінити URL/USER/PASSWORD нижче на свої реальні дані підключення.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    static final String URL = "jdbc:postgresql://localhost:5432/college_db";
    static final String USER = "postgres";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        // try-with-resources (знайоме з заняття про файли в блоці 3) -
        // з'єднання АВТОМАТИЧНО закриється, навіть якщо станеться помилка.
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Підключення до бази даних успішне!");
        } catch (SQLException e) {
            System.out.println("Помилка підключення: " + e.getMessage());
        }
    }
}
