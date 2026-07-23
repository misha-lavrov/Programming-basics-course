// Керована практика: прибрати дублікати з масиву за допомогою HashSet.

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5, 1};

        HashSet<Integer> unique = new HashSet<>();
        for (int number : numbers) {
            unique.add(number);
        }

        System.out.println("До: " + java.util.Arrays.toString(numbers));
        System.out.println("Після (без дублікатів): " + unique);
    }
}
