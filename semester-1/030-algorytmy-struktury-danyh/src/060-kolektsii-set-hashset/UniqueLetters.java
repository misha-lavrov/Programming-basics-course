// Демонстрація: HashSet - колекція, що зберігає лише УНІКАЛЬНІ елементи.
// Додавання елемента, який вже є в множині, просто ігнорується.

import java.util.HashSet;

public class UniqueLetters {
    public static void main(String[] args) {
        String word = "програмування";

        HashSet<Character> uniqueLetters = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            uniqueLetters.add(word.charAt(i));
        }

        System.out.println("Слово: " + word);
        System.out.println("Унікальні букви: " + uniqueLetters);
        System.out.println("Кількість унікальних букв: " + uniqueLetters.size());
    }
}
