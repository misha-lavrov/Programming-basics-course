// Приклад розв'язку челенджу: додати ЩЕ ОДНУ фігуру (трикутник) до
// ShapeDemo.java без зміни жодного рядка в самому ShapeDemo - у цьому і
// сила поліморфізму. Для звірки після самостійної спроби.

public class Triangle implements Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }
}
