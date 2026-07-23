// Керована практика: сума чисел від 1 до n рекурсивно (порівняйте з
// ітеративним варіантом SumToN.java з блоку 1 - результат той самий,
// підхід інший).

public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println("Сума від 1 до 10: " + sum(10));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0; // базовий випадок
        }
        return n + sum(n - 1); // рекурсивний випадок
    }
}
