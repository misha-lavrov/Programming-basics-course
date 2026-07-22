// Демо-приклад для заняття 010 (хук на початку заняття).
// На цьому етапі студенти ще НІЧОГО не писали самі — це виключно демонстрація
// викладача. Пояснювати синтаксис не потрібно, мета — показати "вау-ефект":
// результат роботи справжньої програми.
//
// Як підготуватись: запустити файл ДО заняття і переконатись, що все працює.
// Як запустити: див. src/README.md у цій же папці блоку.

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = 42; // "загадане" число (про випадкові числа поговоримо пізніше)
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess = -1;

        System.out.println("Я загадав число від 1 до 100. Спробуй вгадати!");

        while (guess != secretNumber) {
            System.out.print("Твоя відповідь: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Загадане число БІЛЬШЕ.");
            } else if (guess > secretNumber) {
                System.out.println("Загадане число МЕНШЕ.");
            } else {
                System.out.println("Вітаю! Ти вгадав за " + attempts + " спроб(и).");
            }
        }
    }
}
