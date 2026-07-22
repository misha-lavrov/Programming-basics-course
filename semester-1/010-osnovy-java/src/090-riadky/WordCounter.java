public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Java чудова мова програмування для початківців";

        String[] words = sentence.split(" "); // розбиває рядок на масив слів за пробілом

        System.out.println("Кількість слів: " + words.length);
    }
}
