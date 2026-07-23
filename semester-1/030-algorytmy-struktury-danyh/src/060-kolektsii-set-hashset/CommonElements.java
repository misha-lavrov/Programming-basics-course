// Самостійний челендж: знайти СПІЛЬНІ елементи двох множин (перетин).

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        HashSet<String> group1 = new HashSet<>();
        group1.add("Java");
        group1.add("SQL");
        group1.add("Git");

        HashSet<String> group2 = new HashSet<>();
        group2.add("SQL");
        group2.add("HTML");
        group2.add("Git");

        // retainAll залишає в group1 ЛИШЕ ті елементи, які є ТАКОЖ і в group2
        group1.retainAll(group2);

        System.out.println("Спільні навички: " + group1);
    }
}
