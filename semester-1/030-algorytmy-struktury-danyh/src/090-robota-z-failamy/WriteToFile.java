// Демонстрація: запис тексту у файл.
//
// IOException - checked-виняток: компілятор ЗМУШУЄ або обробити його
// через try/catch, або вказати "throws IOException" у сигнатурі main -
// на відміну від ArithmeticException чи NumberFormatException з минулого
// заняття, які можна (хоч і не завжди варто) не обробляти явно.

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String fileName = "notes.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            // try-with-resources (дужки одразу після try) - файл АВТОМАТИЧНО
            // закриється навіть у разі помилки, не треба писати finally вручну
            writer.write("Перший запис у файл.\n");
            writer.write("Другий рядок.\n");
            System.out.println("Записано у файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Не вдалося записати файл: " + e.getMessage());
        }
    }
}
