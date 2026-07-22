// Самостійна практика: "профіль користувача" + челендж (дні життя).

import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ім'я: ");
        String name = scanner.nextLine();

        System.out.print("Вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        // ↑ "з'їдаємо" залишок рядка після nextInt(). Без цього наступний
        //   nextLine() одразу зчитає порожній рядок замість очікуваного тексту —
        //   класична пастка новачків при змішуванні nextInt()/nextLine().

        System.out.print("Улюблена мова програмування: ");
        String favoriteLanguage = scanner.nextLine();

        System.out.println("---- Профіль ----");
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Улюблена мова: " + favoriteLanguage);

        // Челендж: скільки приблизно днів студент живе на світі
        int daysLived = age * 365;
        System.out.println("Ти живеш на світі приблизно " + daysLived + " днів!");
    }
}
