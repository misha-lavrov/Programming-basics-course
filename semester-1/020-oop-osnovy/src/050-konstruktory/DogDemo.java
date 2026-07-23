// Порівняйте з блоком 040: тепер об'єкт створюється і одразу заповнюється
// ОДНИМ рядком, а не трьома окремими присвоєннями полів.

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Рекс", "Вівчарка", 3);
        Dog secondDog = new Dog("Барсик", "Такса", 1);

        System.out.println(firstDog.name + " (" + firstDog.breed + "), " + firstDog.age + " роки");
        System.out.println(secondDog.name + " (" + secondDog.breed + "), " + secondDog.age + " рік");
    }
}
