// Керована практика: 2D-масив оцінок (рядок = студент, стовпець = предмет).
// Рахуємо середній бал КОЖНОГО студента.

public class GradesMatrix {
    public static void main(String[] args) {
        String[] students = {"Олена", "Максим", "Ірина"};
        int[][] grades = {
                {90, 85, 78}, // оцінки Олени з 3 предметів
                {70, 65, 80}, // оцінки Максима
                {95, 92, 88}  // оцінки Ірини
        };

        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = (double) sum / grades[i].length;
            System.out.println(students[i] + ": середній бал " + average);
        }
    }
}
