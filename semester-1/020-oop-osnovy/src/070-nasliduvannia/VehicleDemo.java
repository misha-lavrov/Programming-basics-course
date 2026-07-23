public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("Невідомий транспорт", 80);
        Car car = new Car("Toyota", 180, 4);

        genericVehicle.describe();
        System.out.println("---");
        car.describe();
    }
}
