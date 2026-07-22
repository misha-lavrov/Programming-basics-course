import java.util.Locale;
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        // useLocale(Locale.US) - важлива деталь! На комп'ютері з українською
        // локаллю Scanner за замовчуванням очікує КОМУ як розділювач дробової
        // частини (наприклад "1,75"), а не крапку, як усюди в коді. Явно
        // задаємо Locale.US, щоб можна було вводити звичне "1.75".
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Вага (кг): ");
        double weight = scanner.nextDouble();

        System.out.print("Зріст (м, наприклад 1.75): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        // printf дозволяє форматувати вивід: %.1f - одна цифра після коми,
        // %n - перехід на новий рядок (кросплатформний аналог \n).
        // Так само явно вказуємо Locale.US, щоб результат друкувався з
        // крапкою (22.9), а не з комою (22,9).
        System.out.printf(Locale.US, "Твій ІМТ: %.1f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Категорія: недостатня вага");
        } else if (bmi < 25) {
            System.out.println("Категорія: норма");
        } else if (bmi < 30) {
            System.out.println("Категорія: надлишкова вага");
        } else {
            System.out.println("Категорія: ожиріння");
        }
    }
}
