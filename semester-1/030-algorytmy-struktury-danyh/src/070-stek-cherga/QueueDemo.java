// Керована практика: Queue - структура FIFO (First In, First Out - перший
// зайшов, перший вийшов). Уявіть звичайну чергу в магазині: хто прийшов
// першим, того першим і обслужать.

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();

        ticketQueue.offer("Клієнт 1"); // стати в чергу
        ticketQueue.offer("Клієнт 2");
        ticketQueue.offer("Клієнт 3");

        System.out.println("Черга: " + ticketQueue);
        System.out.println("Наступний на обслуговування (peek, без видалення): " + ticketQueue.peek());

        System.out.println("Обслуговуємо по черзі (poll):");
        while (!ticketQueue.isEmpty()) {
            System.out.println("Обслуговано: " + ticketQueue.poll()); // виведе Клієнт 1, 2, 3 - у порядку надходження
        }
    }
}
