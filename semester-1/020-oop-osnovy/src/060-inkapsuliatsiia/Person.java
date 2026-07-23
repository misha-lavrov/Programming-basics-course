// Керована практика: приватні поля + гетери/сетери, сетер з валідацією.

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age < 0) {
            System.out.println("Вік не може бути від'ємним, значення не змінено.");
            return;
        }
        this.age = age;
    }
}
