// Демонстрація для заняття 030. Показуємо, ЯК зчитувати ввід і виводити
// персоналізований результат — саме заради цього і потрібні змінні.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Як тебе звати? ");
        String name = scanner.nextLine(); // nextLine() зчитує весь рядок тексту

        System.out.print("Скільки тобі років? ");
        int age = scanner.nextInt(); // nextInt() зчитує ціле число

        System.out.println("Привіт, " + name + "! Тобі " + age + " років.");
        // Оператор + тут об'єднує (конкатенує) текст і значення змінних в один рядок
    }
}
