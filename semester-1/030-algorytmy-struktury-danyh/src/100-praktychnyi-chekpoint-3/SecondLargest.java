// ПРИКЛАД РОЗВ'ЯЗКУ ДЛЯ ВИКЛАДАЧА - задача рівня "легко". Для звірки
// після самостійної спроби студентів, не показувати одразу.

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {23, 5, 67, 12, 89, 1, 45};
        System.out.println("Другий за величиною: " + secondLargest(numbers));
    }

    static int secondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}
