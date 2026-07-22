public class RocketCountdown {
    public static void main(String[] args) {
        int count = 5;

        // do-while виконує тіло ХОЧА Б ОДИН РАЗ, навіть якщо умова одразу хибна -
        // на відміну від звичайного while, який спершу перевіряє умову.
        do {
            System.out.println(count);
            count--;
        } while (count > 0);

        System.out.println("Старт!");
    }
}
