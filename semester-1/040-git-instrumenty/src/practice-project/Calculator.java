// Спільний навчальний проєкт для всього блоку 4. Саме цей файл студенти
// перетворять на свій перший git-репозиторій на занятті 020, і працюватимуть
// з ним (гілки, GitHub, Pull Request, конфлікти) до кінця блоку.

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // .useLocale(Locale.US) - без цього на комп'ютері з українською локаллю
        // Scanner очікуватиме кому замість крапки в дробових числах (пастка,
        // знайома з блоку 1).
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Перше число: ");
        double a = scanner.nextDouble();

        System.out.print("Операція (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Друге число: ");
        double b = scanner.nextDouble();

        double result = calculate(a, operation, b);
        System.out.println("Результат: " + result);
    }

    static double calculate(double a, String operation, double b) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Невідома операція");
                return 0;
        }
    }
}
