// Хук заняття 040: живий приклад до загадки "скільки буде 17 / 5".

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число: ");
        int number = scanner.nextInt();

        // % - оператор "залишок від ділення". Якщо залишок від ділення на 2
        // дорівнює 0 - число парне.
        if (number % 2 == 0) {
            System.out.println(number + " - парне число.");
        } else {
            System.out.println(number + " - непарне число.");
        }
    }
}
