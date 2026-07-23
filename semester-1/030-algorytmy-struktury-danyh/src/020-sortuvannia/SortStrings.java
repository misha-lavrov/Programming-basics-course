// Самостійний челендж: адаптувати selection sort для сортування рядків
// за алфавітом.
//
// ВАЖЛИВА ПАСТКА (перевірено на практиці, не очевидно наперед): звичайний
// names[j].compareTo(names[minIndex]) порівнює рядки за числовими кодами
// Unicode, а НЕ за мовним алфавітом. Українські літери І, Ї, Є, Ґ мають
// код Unicode МЕНШИЙ, ніж А-Я (бо історично додані в інший блок таблиці) -
// тому звичайний compareTo() поставив би "Ірина" ПЕРЕД "Анна", хоча в
// українському алфавіті І йде після А і Б. Правильне рішення - Collator
// з українською локаллю, який порівнює рядки саме за мовним алфавітом.

import java.text.Collator;
import java.util.Locale;

public class SortStrings {
    public static void main(String[] args) {
        String[] names = {"Максим", "Богдан", "Ірина", "Анна"};
        Collator ukrainianCollator = Collator.getInstance(new Locale("uk", "UA"));

        for (int i = 0; i < names.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                // ukrainianCollator.compare(...) - те саме, що compareTo(),
                // але з урахуванням правил конкретної мови (тут - української)
                if (ukrainianCollator.compare(names[j], names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }

        System.out.println(java.util.Arrays.toString(names));
        // Очікуваний результат: [Анна, Богдан, Ірина, Максим]
    }
}
