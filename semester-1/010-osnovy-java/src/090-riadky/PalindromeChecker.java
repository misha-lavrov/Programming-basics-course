import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи слово: ");
        String word = scanner.nextLine().toLowerCase();

        // StringBuilder тут - готовий інструмент, щоб розвернути рядок в один
        // рядок коду. Детально StringBuilder не розбираємо, головне - результат.
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " - паліндром.");
        } else {
            System.out.println(word + " - НЕ паліндром.");
        }
    }
}
