// Самостійний челендж: перевірка, чи рік високосний.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи рік: ");
        int year = scanner.nextInt();

        // Правило високосного року: ділиться на 4, АЛЕ якщо ділиться на 100 -
        // то НЕ високосний, АЛЕ якщо ще й ділиться на 400 - то знову високосний.
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " - високосний рік.");
        } else {
            System.out.println(year + " - НЕ високосний рік.");
        }
    }
}
