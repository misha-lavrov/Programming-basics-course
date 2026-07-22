// Челендж: розвернути масив без вбудованих методів.

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Обмінюємо елементи з початку і з кінця, рухаючись до середини
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
