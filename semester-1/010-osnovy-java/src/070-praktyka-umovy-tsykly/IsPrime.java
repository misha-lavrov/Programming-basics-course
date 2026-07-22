// Демонстрація: перевірка, чи є число простим.

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число: ");
        int number = scanner.nextInt();

        boolean isPrime = number > 1;
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
                break; // дільник знайдено - далі перевіряти немає сенсу
            }
        }

        if (isPrime) {
            System.out.println(number + " - просте число.");
        } else {
            System.out.println(number + " - НЕ просте число.");
        }
    }
}
