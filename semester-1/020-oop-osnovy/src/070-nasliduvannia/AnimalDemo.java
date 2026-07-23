public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Мурка");

        dog.makeSound(); // власна (перевизначена) поведінка Dog
        cat.makeSound(); // власна (перевизначена) поведінка Cat

        dog.eat(); // успадкований від Animal метод - однаковий для всіх
        cat.eat();
    }
}
