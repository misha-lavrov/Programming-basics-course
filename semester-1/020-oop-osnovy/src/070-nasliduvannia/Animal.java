// Демонстрація наслідування: спільна поведінка для ВСІХ тварин виноситься
// в базовий (батьківський) клас Animal, а Dog і Cat його наслідують.

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " видає якийсь звук.");
    }

    void eat() {
        System.out.println(name + " їсть.");
    }
}
