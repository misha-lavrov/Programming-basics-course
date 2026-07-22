public class GradesAverage {
    public static void main(String[] args) {
        int[] grades = {80, 92, 75, 88, 95};

        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = (double) sum / grades.length;
        System.out.println("Середній бал: " + average);
    }
}
