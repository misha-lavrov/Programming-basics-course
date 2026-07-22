import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи слово: ");
        String word = scanner.nextLine();

        String vowels = "аеєиіїоуюя";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = Character.toLowerCase(word.charAt(i));
            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }

        System.out.println("Кількість голосних: " + count);
    }
}
