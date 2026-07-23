// Демонстрація: створюємо ОБ'ЄКТИ класу Dog і заповнюємо їхні поля.
// Зверніть увагу: Dog.java не має main() - це "модель" даних. DogDemo.java -
// окремий клас, який цю модель ВИКОРИСТОВУЄ. Такий поділ - звичайна практика.

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog(); // створення об'єкта - "new" виділяє пам'ять під новий екземпляр
        firstDog.name = "Рекс";
        firstDog.breed = "Вівчарка";
        firstDog.age = 3;

        Dog secondDog = new Dog();
        secondDog.name = "Барсик"; // так, ім'я не відповідає породі - це навмисний жарт :)
        secondDog.breed = "Такса";
        secondDog.age = 1;

        // Два об'єкти одного класу - незалежні один від одного
        System.out.println(firstDog.name + " (" + firstDog.breed + "), " + firstDog.age + " роки");
        System.out.println(secondDog.name + " (" + secondDog.breed + "), " + secondDog.age + " рік");
    }
}
