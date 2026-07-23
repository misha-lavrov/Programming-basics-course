// Керована практика: selection sort (сортування вибором) - на кожному
// кроці знаходимо НАЙМЕНШИЙ елемент серед решти і ставимо його на своє місце.

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("До сортування: " + java.util.Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println("Після сортування: " + java.util.Arrays.toString(numbers));
    }
}
