public class WeeklyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {18, 21, 25, 30, 27, 22, 19};
        String[] days = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Нд"};

        int sum = 0;
        int hottestIndex = 0;

        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
            if (temperatures[i] > temperatures[hottestIndex]) {
                hottestIndex = i;
            }
        }

        double average = (double) sum / temperatures.length;
        System.out.println("Середня температура за тиждень: " + average);
        System.out.println("Найспекотніший день: " + days[hottestIndex] + " (" + temperatures[hottestIndex] + " градусів)");
    }
}
