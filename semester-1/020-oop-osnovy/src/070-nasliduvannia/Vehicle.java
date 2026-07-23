// Керована практика: ще один приклад успадкування з акцентом на super(...)
// у конструкторі.

public class Vehicle {
    String brand;
    int maxSpeed;

    Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    void describe() {
        System.out.println(brand + ", максимальна швидкість " + maxSpeed + " км/год");
    }
}
