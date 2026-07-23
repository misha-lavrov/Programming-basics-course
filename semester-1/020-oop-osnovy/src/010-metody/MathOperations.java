// Керована практика: методи, які ПОВЕРТАЮТЬ значення (не void).

public class MathOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Результат виклику методу - це звичайне значення, яке можна
        // одразу вивести, зберегти в змінну або використати в обчисленні.
        System.out.println("Сума: " + add(a, b));
        System.out.println("Різниця: " + subtract(a, b));
        System.out.println("Добуток: " + multiply(a, b));

        int sum = add(a, b);
        System.out.println("Збережений результат: " + sum);
    }

    // int перед іменем методу - тип значення, яке метод поверне
    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }
}
