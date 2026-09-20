// Демонстрація "під капотом": як виглядає HTTP-сервер БЕЗ жодного фреймворку
// (Spring Boot та подібні розберемо в 2 семестрі). Використовуємо
// com.sun.net.httpserver.HttpServer - вбудований у сам JDK, не потребує
// жодних зовнішніх бібліотек чи Maven/Gradle.

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Кожен "context" - це один маршрут (route): яка адреса -> який код обробляє запит
        server.createContext("/", SimpleHttpServer::handleRoot);
        server.createContext("/api/students", SimpleHttpServer::handleStudents);

        server.setExecutor(null); // null = використати стандартний виконавець за замовчуванням
        server.start();

        System.out.println("Сервер запущено: http://localhost:8080");
        System.out.println("Спробуйте: http://localhost:8080/ та http://localhost:8080/api/students");
    }

    static void handleRoot(HttpExchange exchange) throws IOException {
        String response = "Привіт! Це мій перший HTTP-сервер на Java.";
        sendResponse(exchange, 200, "text/plain; charset=utf-8", response);
    }

    static void handleStudents(HttpExchange exchange) throws IOException {
        // JSON тут побудований вручну, як текст - бібліотек для роботи з JSON
        // ще не проходили. У реальних проєктах цим займається бібліотека
        // (наприклад Jackson) - розберемо в 2 семестрі разом із фреймворками.
        String json = """
                [
                  {"name": "Олена Ковальчук", "birthYear": 2006},
                  {"name": "Максим Ткаченко", "birthYear": 2005}
                ]""";
        sendResponse(exchange, 200, "application/json; charset=utf-8", json);
    }

    static void sendResponse(HttpExchange exchange, int statusCode, String contentType, String body) throws IOException {
        byte[] bytes = body.getBytes("UTF-8");
        exchange.getResponseHeaders().set("Content-Type", contentType);
        exchange.sendResponseHeaders(statusCode, bytes.length);

        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(bytes);
        }
    }
}
