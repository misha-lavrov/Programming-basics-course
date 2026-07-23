public class Car extends Vehicle {
    int doors;

    Car(String brand, int maxSpeed, int doors) {
        super(brand, maxSpeed); // спочатку заповнюємо "успадковану" частину через батьківський конструктор
        this.doors = doors;     // потім - власне поле, якого немає у Vehicle
    }

    @Override
    void describe() {
        super.describe(); // викликаємо ОРИГІНАЛЬНУ версію методу з Vehicle...
        System.out.println("Кількість дверей: " + doors); // ...і доповнюємо її
    }
}
