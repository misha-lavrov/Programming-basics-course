import java.util.Scanner;

public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Від: ");
        int from = scanner.nextInt();
        System.out.print("До: ");
        int to = scanner.nextInt();

        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
