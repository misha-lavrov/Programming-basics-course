public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {23, 5, 67, 12, 89, 1, 45};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);
    }
}
