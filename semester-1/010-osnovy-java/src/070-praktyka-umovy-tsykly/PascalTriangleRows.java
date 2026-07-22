// Приклад розв'язку рівня 3 (для звірки після спроби студентів).

public class PascalTriangleRows {
    public static void main(String[] args) {
        int rows = 6;

        for (int row = 0; row < rows; row++) {
            long value = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");
                // Формула сусіднього елемента трикутника Паскаля:
                value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}
