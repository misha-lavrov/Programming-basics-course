// Демонстрація: bubble sort (сортування бульбашкою) - на кожному проході
// порівнюємо сусідні елементи і міняємо місцями, якщо стоять не в порядку.
// Найбільший елемент "спливає" в кінець за один прохід - звідси назва.

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("До сортування: " + java.util.Arrays.toString(numbers));

        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int i = 0; i < numbers.length - 1 - pass; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            System.out.println("Після проходу " + (pass + 1) + ": " + java.util.Arrays.toString(numbers));
        }

        System.out.println("Після сортування: " + java.util.Arrays.toString(numbers));
    }
}
