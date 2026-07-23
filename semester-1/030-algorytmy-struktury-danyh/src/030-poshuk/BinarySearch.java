// Керована практика: бінарний пошук - працює ЛИШЕ на ВІДСОРТОВАНОМУ масиві!
// Ідея: дивимось на середній елемент; якщо шуканого числа там немає -
// відкидаємо ПОЛОВИНУ масиву одразу (ліву або праву), і повторюємо для
// решти. Тому значно швидший за лінійний пошук на великих масивах.

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedNumbers = {1, 5, 12, 23, 45, 67, 89}; // ВАЖЛИВО: масив відсортований

        System.out.println("Індекс числа 45: " + binarySearch(sortedNumbers, 45));
        System.out.println("Індекс числа 100: " + binarySearch(sortedNumbers, 100));
    }

    static int binarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (sortedArray[middle] == target) {
                return middle;
            } else if (sortedArray[middle] < target) {
                left = middle + 1; // шукане число більше - дивимось у правій половині
            } else {
                right = middle - 1; // шукане число менше - дивимось у лівій половині
            }
        }

        return -1; // не знайдено
    }
}
