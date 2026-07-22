import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Порахувати суму чисел від 1 до: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // те саме, що sum = sum + i
        }

        System.out.println("Сума: " + sum);
    }
}
