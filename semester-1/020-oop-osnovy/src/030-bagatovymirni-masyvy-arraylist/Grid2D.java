// Демонстрація: двовимірний масив - "таблиця" (рядки і стовпці).

public class Grid2D {
    public static void main(String[] args) {
        // 3 рядки по 3 стовпці, як поле для хрестиків-нуликів
        String[][] board = {
                {"X", "O", "X"},
                {"O", "X", "O"},
                {"X", "O", "X"}
        };

        // Перший індекс - рядок, другий - стовпець
        System.out.println("Клітинка [0][0]: " + board[0][0]);
        System.out.println("Клітинка [1][2]: " + board[1][2]);

        // Обхід усього двовимірного масиву - цикл усередині циклу
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println(); // новий рядок після кожного ряду таблиці
        }
    }
}
