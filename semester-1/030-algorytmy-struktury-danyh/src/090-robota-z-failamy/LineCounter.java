// Самостійний челендж: порахувати кількість рядків і слів у файлі.
// Запустіть спочатку WriteToFile.java з цієї ж папки, щоб файл існував.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {
    public static void main(String[] args) {
        String fileName = "notes.txt";

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            int lineCount = 0;
            int wordCount = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;
                wordCount += line.split("\\s+").length; // розбиваємо по будь-якій кількості пробілів
            }

            System.out.println("Рядків: " + lineCount);
            System.out.println("Слів: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено: " + fileName + ". Спершу запустіть WriteToFile.java.");
        }
    }
}
