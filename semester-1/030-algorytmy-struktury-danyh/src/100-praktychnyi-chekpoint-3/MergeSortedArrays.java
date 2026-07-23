// ПРИКЛАД РОЗВ'ЯЗКУ ДЛЯ ВИКЛАДАЧА - задача рівня "середньо". Об'єднати два
// ВЖЕ ВІДСОРТОВАНІ масиви в один відсортований, не сортуючи результат
// заново з нуля - головна ідея в тому, щоб скористатись тим, що вхідні
// масиви вже впорядковані.

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] first = {1, 3, 5, 7};
        int[] second = {2, 4, 6, 8, 10};

        int[] merged = merge(first, second);
        System.out.println(java.util.Arrays.toString(merged));
    }

    static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }

        // Дописуємо "хвіст" того масиву, який ще не закінчився
        while (i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }

        return result;
    }
}
