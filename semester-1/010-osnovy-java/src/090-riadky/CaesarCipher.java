// Челендж: простий шифр Цезаря (зсув кожної літери на shift позицій).
// Працює для малих латинських літер, без пробілів/великих літер - навмисно
// спрощено, щоб зосередитись на ідеї, а не на всіх крайових випадках.

public class CaesarCipher {
    public static void main(String[] args) {
        String word = "hello";
        int shift = 3;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            char shifted = (char) ('a' + (letter - 'a' + shift) % 26);
            result.append(shifted);
        }

        System.out.println("Зашифровано: " + result);
    }
}
