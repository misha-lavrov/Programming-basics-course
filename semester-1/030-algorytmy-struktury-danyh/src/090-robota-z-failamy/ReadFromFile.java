// Керована практика: читання тексту з файлу через Scanner(File).
// Запустіть спочатку WriteToFile.java з цієї ж папки, щоб файл існував.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        String fileName = "notes.txt";

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println("Прочитано: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено: " + fileName + ". Спершу запустіть WriteToFile.java.");
        }
    }
}
