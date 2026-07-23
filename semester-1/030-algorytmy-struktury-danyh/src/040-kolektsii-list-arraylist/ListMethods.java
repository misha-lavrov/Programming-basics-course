// Демонстрація: детальніше про ArrayList - методи, яких немає у звичайного
// масиву, і сортування готовим інструментом замість ручного bubble/selection sort.

import java.util.ArrayList;
import java.util.Collections;

public class ListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);

        System.out.println("Список: " + numbers);
        System.out.println("Індекс числа 9: " + numbers.indexOf(9));
        System.out.println("Чи містить 100: " + numbers.contains(100));

        Collections.sort(numbers); // готова сортування - не треба писати bubble sort самим
        System.out.println("Відсортовано: " + numbers);

        Collections.reverse(numbers);
        System.out.println("У зворотному порядку: " + numbers);
    }
}
