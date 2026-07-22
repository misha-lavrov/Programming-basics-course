// Приклад розв'язку рівня 3 (для звірки після спроби студентів).

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число: ");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }

        if (original == reversed) {
            System.out.println(original + " - паліндром.");
        } else {
            System.out.println(original + " - НЕ паліндром.");
        }
    }
}
