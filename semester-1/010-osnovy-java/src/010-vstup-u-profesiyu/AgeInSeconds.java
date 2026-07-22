// Демо-приклад для заняття 010 (розділ "Демонстрація").
// Викладач показує цю програму й пояснює ЗАГАЛЬНУ ідею (ввід -> обчислення ->
// вивід), не заглиблюючись у синтаксис — детально всі ці конструкції
// розберемо на наступних заняттях (змінні, оператори, Scanner).

import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Скільки тобі років? ");
        int age = scanner.nextInt();

        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;

        // long використовуємо тому, що результат виходить дуже великим числом
        // (звичайного int може не вистачити)
        long seconds = (long) age * daysInYear * hoursInDay * minutesInHour * secondsInMinute;

        System.out.println("Тобі приблизно " + seconds + " секунд!");
    }
}
