// ВИПРАВЛЕНА версія - для звірки після самостійної практики з дебагером.
// Не показувати одразу, спочатку студенти мають знайти обидва баги самі.

public class BuggyCalculatorFixed {
    public static void main(String[] args) {
        int[] grades = {80, 91, 75, 88, 95};

        int sum = 0;
        for (int i = 0; i < grades.length; i++) { // виправлено: i = 0
            sum += grades[i];
        }

        double average = (double) sum / grades.length; // виправлено: приведення до double
        System.out.println("Сума: " + sum);
        System.out.println("Середній бал: " + average);
    }
}
