// Керована практика: телефонна книга - HashMap<String, String>, ключ - ім'я,
// значення - номер телефону.

import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Олена", "+380501112233");
        phoneBook.put("Максим", "+380672223344");

        System.out.println("Телефон Олени: " + phoneBook.get("Олена"));
        System.out.println("Телефон Івана: " + phoneBook.get("Іван")); // null - такого ключа немає

        phoneBook.remove("Максим");
        System.out.println("Після видалення Максима: " + phoneBook);

        System.out.println("Чи є в книзі Олена: " + phoneBook.containsKey("Олена"));
    }
}
