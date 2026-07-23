// Демонстрація перевантаження методів (overloading): кілька методів з ОДНАКОВИМ
// іменем, але РІЗНИМ набором параметрів. Java сама визначає, який саме метод
// викликати, за кількістю і типами аргументів.

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));         // викличе версію для двох int
        System.out.println(sum(2, 3, 4));      // викличе версію для трьох int
        System.out.println(sum(2.5, 3.5));     // викличе версію для double
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
