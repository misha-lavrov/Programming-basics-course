import java.util.Scanner;

public class FullCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Перше число: ");
        int a = scanner.nextInt();

        System.out.print("Друге число: ");
        int b = scanner.nextInt();

        System.out.println("Сума: " + (a + b));
        System.out.println("Різниця: " + (a - b));
        System.out.println("Добуток: " + (a * b));
        System.out.println("Частка (цілочисельна): " + (a / b));
        System.out.println("Залишок: " + (a % b));

        // Якщо хочемо дробовий результат ділення - треба привести хоча б
        // одне число до double, інакше Java округлить до цілого:
        double preciseDivision = (double) a / b;
        System.out.println("Частка (дробова): " + preciseDivision);
    }
}
