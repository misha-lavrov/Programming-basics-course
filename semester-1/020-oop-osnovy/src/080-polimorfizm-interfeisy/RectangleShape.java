// Назва RectangleShape (а не Rectangle) - щоб не плутати з класом Rectangle
// із заняття 050, який жив в іншій папці і не мав stосунку до інтерфейсу Shape.

public class RectangleShape implements Shape {
    double width;
    double height;

    RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
