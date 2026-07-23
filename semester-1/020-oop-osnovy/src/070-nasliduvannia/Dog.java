// extends Animal - Dog УСПАДКОВУЄ поле name, конструктор і метод eat() від
// Animal, і НЕ повинен писати їх заново. makeSound() - перевизначений
// (override) під конкретну поведінку собаки.

public class Dog extends Animal {
    Dog(String name) {
        super(name); // super(...) викликає конструктор БАТЬКІВСЬКОГО класу Animal
    }

    @Override
    void makeSound() {
        System.out.println(name + " гавкає: Гав-гав!");
    }
}
