import java.util.Scanner;

public class DayOfWeekSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Номер дня тижня (1-7): ");
        int day = scanner.nextInt();

        String dayName;
        switch (day) {
            case 1:
                dayName = "Понеділок";
                break;
            case 2:
                dayName = "Вівторок";
                break;
            case 3:
                dayName = "Середа";
                break;
            case 4:
                dayName = "Четвер";
                break;
            case 5:
                dayName = "П'ятниця";
                break;
            case 6:
                dayName = "Субота";
                break;
            case 7:
                dayName = "Неділя";
                break;
            default:
                dayName = "Такого дня не існує";
        }

        System.out.println(dayName);
        // Важливо: break зупиняє виконання switch. Якщо його забути,
        // виконання "провалиться" у наступний case - типова помилка новачків.
    }
}
