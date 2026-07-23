// Керована практика: простий список завдань (to-do list) на ArrayList<String>.

import java.util.ArrayList;

public class TaskList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Зробити домашнє завдання");
        tasks.add("Прочитати розділ про колекції");
        tasks.add("Підготуватись до чекпоінту");

        System.out.println("Завдання на сьогодні:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // "Виконали" перше завдання - видаляємо за ІНДЕКСОМ
        tasks.remove(0);
        System.out.println("\nПісля виконання першого завдання:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
