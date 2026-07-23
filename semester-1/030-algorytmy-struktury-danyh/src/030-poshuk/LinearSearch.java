// Демонстрація: лінійний пошук - перевіряємо елементи по черзі, поки не
// знайдемо потрібний. Працює на будь-якому масиві, відсортованому чи ні.

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {23, 5, 67, 12, 89, 1, 45};

        System.out.println("Індекс числа 12: " + linearSearch(numbers, 12));
        System.out.println("Індекс числа 100: " + linearSearch(numbers, 100));
    }

    static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // знайшли - повертаємо індекс одразу
            }
        }
        return -1; // не знайшли жодного відповідного елемента
    }
}
