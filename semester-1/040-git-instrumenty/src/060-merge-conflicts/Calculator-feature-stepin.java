// Знімок файлу Calculator.java на гілці feature/stepin (перевірено: саме
// такий вміст дає конфлікт при спробі merge з feature/ostacha нижче -
// обидві гілки редагують ті самі рядки в calculate()).

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
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
            case "^":
                return Math.pow(a, b);
            default:
                System.out.println("Невідома операція");
                return 0;
        }
    }
}
