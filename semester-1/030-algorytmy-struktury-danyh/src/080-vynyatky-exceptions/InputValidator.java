// Керована практика: NumberFormatException - типова ситуація, коли
// користувач вводить не те, що очікує програма.
//
// Навмисно використовуємо Integer.parseInt() замість Scanner.nextInt() -
// так помилка стається саме там, де ми явно її очікуємо і обробляємо,
// а не десь у надрах Scanner.

import java.util.Scanner;

public class InputValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи своє число: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Ти ввів число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("'" + input + "' - це не число. Спробуй ще раз наступного разу.");
        }
    }
}
