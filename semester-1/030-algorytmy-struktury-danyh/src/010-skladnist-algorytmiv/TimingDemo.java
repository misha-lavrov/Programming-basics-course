// Самостійний челендж: реальний вимірювальний експеримент. Порахувати
// суму пар елементів масиву (O(n^2)) і подивитись, як реально росте час
// виконання зі збільшенням n.
//
// ВАЖЛИВІ ДЕТАЛІ (перевірено на практиці, реальні виміри на JVM - шумна
// справа):
// 1. Без "розігріву" перші виміри ненадійні - Java на льоту компілює
//    "гарячий" код у швидший машинний код (JIT-компіляція), тому перші
//    виклики методу повільніші за наступні незалежно від розміру n.
// 2. Навіть після розігріву окремий замір може "шумнути" через паузи
//    операційної системи. Тому кожен розмір вимірюємо кілька разів і
//    беремо НАЙМЕНШИЙ час - він найточніше відображає чисту швидкість
//    роботи алгоритму, без стороннього шуму.
// Це не примха: саме так (спрощено) працюють професійні інструменти для
// вимірювання продуктивності Java-коду (наприклад JMH).

public class TimingDemo {
    public static void main(String[] args) {
        warmUp();

        int[] sizes = {2000, 4000, 8000, 16000};

        for (int n : sizes) {
            double bestMilliseconds = Double.MAX_VALUE;

            for (int trial = 0; trial < 5; trial++) {
                long startTime = System.nanoTime();
                countPairs(n);
                long endTime = System.nanoTime();

                double milliseconds = (endTime - startTime) / 1_000_000.0;
                if (milliseconds < bestMilliseconds) {
                    bestMilliseconds = milliseconds;
                }
            }

            System.out.println("n = " + n + ": найкращий час " + bestMilliseconds + " мс");
        }
    }

    static void warmUp() {
        for (int i = 0; i < 20; i++) {
            countPairs(2000);
        }
    }

    static long countPairs(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
            }
        }
        return count;
    }
}
