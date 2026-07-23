// Демонстрація: try/catch/finally. Без обробки виключення програма
// аварійно завершується одразу на проблемному рядку. try/catch дозволяє
// "перехопити" помилку і відреагувати, не зупиняючи всю програму.

public class DivisionSafe {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0, 2};

        for (int divisor : numbers) {
            try {
                int result = 100 / divisor; // ділення на 0 кине ArithmeticException
                System.out.println("100 / " + divisor + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Не можна ділити на " + divisor + ": " + e.getMessage());
            } finally {
                // finally виконується ЗАВЖДИ - і коли все пройшло добре, і коли
                // сталася помилка. Часто використовують для "прибирання"
                // (закриття файлів, з'єднань тощо) - побачимо це на наступному занятті.
                System.out.println("Спроба ділення на " + divisor + " завершена.\n");
            }
        }
    }
}
