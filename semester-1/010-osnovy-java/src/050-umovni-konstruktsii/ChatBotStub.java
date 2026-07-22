import java.util.Scanner;

public class ChatBotStub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привіт! Я простий бот. Напиши: привіт, як справи, або бувай.");
        System.out.print("Ти: ");
        String message = scanner.nextLine();

        switch (message) {
            case "привіт":
                System.out.println("Бот: Привіт! Радий тебе бачити.");
                break;
            case "як справи":
                System.out.println("Бот: Все чудово, я ж просто код :)");
                break;
            case "бувай":
                System.out.println("Бот: До зустрічі!");
                break;
            default:
                System.out.println("Бот: Я поки не розумію цю фразу.");
        }
    }
}
