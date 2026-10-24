import java.util.Scanner;

// Еталонне рішення домашнього завдання «тест на кмітливість» (заняття 040).
// Умовних конструкцій (if) ми ще не проходили, тому програма не пише
// «Правильно!» словами, а виводить результат порівняння: true або false.
public class QuickQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Числа для прикладів лежать у змінних, а не вписані в текст запитання.
        // Захочемо інший приклад — змінимо лише ці два рядки.
        int a = 17;
        int b = 5;

        // --- Запитання 1: додавання ---
        System.out.println("Запитання 1. Скільки буде " + a + " + " + b + "?");
        int answer1 = scanner.nextInt();

        // Правильну відповідь рахуємо окремою змінною, щоб потім її і порівняти, і показати.
        int correct1 = a + b;

        // Один знак = — присвоєння, два == — порівняння. Результат порівняння
        // має тип boolean, тому його можна покласти у змінну і вивести.
        boolean isCorrect1 = answer1 == correct1;
        System.out.println("Ваша відповідь правильна: " + isCorrect1);
        System.out.println("Правильна відповідь: " + correct1);

        // --- Запитання 2 (ускладнення): цілочисельне ділення ---
        // Обидва операнди int, тому відповідь теж ціла: 17 / 5 дає 3, а не 3.4.
        System.out.println();
        System.out.println("Запитання 2. Скільки буде " + a + " / " + b + " (лише ціла частина)?");
        int answer2 = scanner.nextInt();
        int correct2 = a / b;
        boolean isCorrect2 = answer2 == correct2;
        System.out.println("Ваша відповідь правильна: " + isCorrect2);
        System.out.println("Правильна відповідь: " + correct2);

        // --- Запитання 3 (ускладнення): залишок від ділення ---
        System.out.println();
        System.out.println("Запитання 3. Який залишок від ділення " + a + " на " + b + "?");
        int answer3 = scanner.nextInt();
        int correct3 = a % b;
        boolean isCorrect3 = answer3 == correct3;
        System.out.println("Ваша відповідь правильна: " + isCorrect3);
        System.out.println("Правильна відповідь: " + correct3);

        // --- Підсумок: чи правильні ВСІ відповіді одночасно ---
        // && дає true лише тоді, коли true з обох боків.
        System.out.println();
        boolean allCorrect = isCorrect1 && isCorrect2 && isCorrect3;
        System.out.println("Усі відповіді правильні: " + allCorrect);

        // Зверніть увагу: тут лише цілі числа (int і nextInt). Зчитування дробових
        // через Scanner залежить від мови системи (крапка чи кома), тому поки уникаємо.
    }
}
