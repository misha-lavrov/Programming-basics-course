// ПРИКЛАД РОЗВ'ЯЗКУ ДЛЯ ВИКЛАДАЧА - варіант "Вгадай число" з чекпоінту.
// НЕ показувати студентам одразу - це орієнтир по очікуваному обсягу й
// складності, а не еталон "як правильно". У студентів код виглядатиме
// простіше і по-своєму - це нормально й очікувано.

import java.util.Scanner;

public class GuessNumberFull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 37;
        int attempts = 0;
        int maxAttempts = 7;
        boolean guessedCorrectly = false;

        System.out.println("Я загадав число від 1 до 100. У тебе " + maxAttempts + " спроб.");

        while (attempts < maxAttempts && !guessedCorrectly) {
            System.out.print("Спроба " + (attempts + 1) + ": ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("Більше!");
            } else {
                System.out.println("Менше!");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Вітаю! Вгадано за " + attempts + " спроб(и).");
        } else {
            System.out.println("Спроби закінчились. Загадане число було: " + secretNumber);
        }
    }
}
