// Самостійний челендж: порахувати КІЛЬКІСТЬ порівнянь, які знадобились
// лінійному та бінарному пошуку для одного й того самого масиву - наочно
// побачити різницю в складності (O(n) проти O(log n)) з блоку 010.

public class SearchComparison {
    public static void main(String[] args) {
        int size = 1000;
        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = i; // 0, 1, 2, ..., 999 - вже відсортовано
        }

        int target = 999; // найгірший випадок для лінійного пошуку - елемент в кінці

        int[] linearComparisons = {0};
        linearSearchCounting(sortedArray, target, linearComparisons);
        System.out.println("Лінійний пошук: " + linearComparisons[0] + " порівнянь");

        int[] binaryComparisons = {0};
        binarySearchCounting(sortedArray, target, binaryComparisons);
        System.out.println("Бінарний пошук: " + binaryComparisons[0] + " порівнянь");
    }

    static void linearSearchCounting(int[] array, int target, int[] counter) {
        for (int value : array) {
            counter[0]++;
            if (value == target) {
                return;
            }
        }
    }

    static void binarySearchCounting(int[] array, int target, int[] counter) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            counter[0]++;
            int middle = (left + right) / 2;
            if (array[middle] == target) {
                return;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
    }
}
