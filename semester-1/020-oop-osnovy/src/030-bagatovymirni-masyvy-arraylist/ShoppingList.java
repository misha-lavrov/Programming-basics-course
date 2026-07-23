// Самостійна практика: перше знайомство з ArrayList.
//
// На відміну від звичайного масиву (int[], String[]), ArrayList може
// РОСТИ і ЗМЕНШУВАТИСЬ під час роботи програми - не потрібно заздалегідь
// знати, скільки елементів там буде.

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Молоко");
        shoppingList.add("Хліб");
        shoppingList.add("Яйця");

        System.out.println("Список покупок: " + shoppingList);
        System.out.println("Кількість позицій: " + shoppingList.size());

        shoppingList.remove("Хліб"); // видаляємо за значенням
        System.out.println("Після видалення хліба: " + shoppingList);

        shoppingList.add(0, "Терміново: сіль"); // додаємо на конкретну позицію
        System.out.println("Після додавання на початок: " + shoppingList);

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
    }
}
