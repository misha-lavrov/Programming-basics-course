// Демонстрація: замість вимірювання часу (який залежить від конкретного
// комп'ютера) рахуємо КІЛЬКІСТЬ базових операцій - так наочніше видно, як
// швидкість росте залежно від розміру вхідних даних (n).

public class OperationCounter {
    public static void main(String[] args) {
        int[] sizes = {10, 20, 40, 80};

        for (int n : sizes) {
            System.out.println("n = " + n);
            System.out.println("  Доступ за індексом (O(1)):     1 операція завжди");
            System.out.println("  Обхід усього масиву (O(n)):    " + countLinear(n) + " операцій");
            System.out.println("  Всі пари елементів (O(n^2)):   " + countQuadratic(n) + " операцій");
        }
        // Зверніть увагу: коли n подвоюється, O(n) теж просто подвоюється,
        // а O(n^2) зростає вчетверо - ось чому складність важлива на великих даних.
    }

    // Імітуємо один прохід по масиву розміру n - лічимо кроки, а не реально
    // створюємо масив
    static int countLinear(int n) {
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations++;
        }
        return operations;
    }

    // Імітуємо порівняння КОЖНОГО елемента з КОЖНИМ (як у bubble sort)
    static int countQuadratic(int n) {
        int operations = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                operations++;
            }
        }
        return operations;
    }
}
