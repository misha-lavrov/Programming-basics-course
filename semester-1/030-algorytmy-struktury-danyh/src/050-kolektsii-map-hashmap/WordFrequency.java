// Демонстрація: HashMap<String, Integer> - зберігає пари "слово -> скільки
// разів зустрілось". Класична задача, де Map значно зручніший за масив.

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String[] words = {"java", "код", "java", "клас", "код", "java"};

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1); // слово вже було - збільшуємо лічильник
            } else {
                frequency.put(word, 1); // перша поява слова
            }
        }

        System.out.println(frequency);

        for (String word : frequency.keySet()) {
            System.out.println(word + ": " + frequency.get(word) + " раз(и)");
        }
    }
}
