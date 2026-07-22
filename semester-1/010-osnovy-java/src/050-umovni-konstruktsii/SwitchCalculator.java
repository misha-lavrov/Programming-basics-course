// Челендж: калькулятор, що обирає дію через switch за символом операції.

import java.util.Locale;
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        // useLocale(Locale.US) - без цього на комп'ютері з українською локаллю
        // Scanner очікуватиме кому замість крапки в дробових числах (див.
        // коментар у BmiCalculator.java для деталей).
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Перше число: ");
        double a = scanner.nextDouble();

        System.out.print("Операція (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Друге число: ");
        double b = scanner.nextDouble();

        double result;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Невідома операція");
                return; // достроково завершуємо main, якщо операція не розпізнана
        }

        System.out.println("Результат: " + result);
    }
}
