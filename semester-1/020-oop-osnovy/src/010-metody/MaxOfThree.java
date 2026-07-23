// Самостійний челендж: метод, що повертає найбільше з трьох чисел.

public class MaxOfThree {
    public static void main(String[] args) {
        System.out.println(max(5, 12, 7));
        System.out.println(max(-3, -8, -1));
        System.out.println(max(4, 4, 4));
    }

    static int max(int a, int b, int c) {
        int biggest = a;
        if (b > biggest) {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }
        return biggest;
    }
}
