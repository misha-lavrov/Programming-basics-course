// Демонстрація рекурсії: факторіал (n! = 1 * 2 * ... * n).
//
// Кожна рекурсивна функція має дві частини:
// 1. Базовий випадок (base case) - умова, коли рекурсія ЗУПИНЯЄТЬСЯ.
//    Без неї функція викликатиме сама себе нескінченно (StackOverflowError).
// 2. Рекурсивний випадок - функція викликає САМА СЕБЕ з "меншою" задачею.

public class Factorial {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("1! = " + factorial(1));
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1; // базовий випадок: факторіал 0 і 1 дорівнює 1
        }
        return n * factorial(n - 1); // рекурсивний випадок
        // Розкрутка для factorial(5):
        // factorial(5) = 5 * factorial(4)
        //              = 5 * (4 * factorial(3))
        //              = 5 * (4 * (3 * factorial(2)))
        //              = 5 * (4 * (3 * (2 * factorial(1))))
        //              = 5 * 4 * 3 * 2 * 1 = 120
    }
}
