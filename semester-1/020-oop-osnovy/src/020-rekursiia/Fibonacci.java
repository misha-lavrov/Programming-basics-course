// Самостійний челендж: n-те число Фібоначчі рекурсивно.
// Послідовність: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
// Кожне наступне число - сума двох попередніх.
//
// Порада для обговорення з групою: ця рекурсія значно повільніша за
// factorial(), бо викликає САМУ СЕБЕ ДВІЧІ на кожному кроці - варто
// спробувати запустити fibonacci(40) і подивитись, як довго рахує.

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n; // базовий випадок
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // рекурсивний випадок
    }
}
