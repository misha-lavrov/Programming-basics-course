// Самостійний челендж: клас Rectangle з методом area() і перевантаженим
// конструктором для окремого випадку - квадрата (width == height).

public class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Перевантажений конструктор для квадрата: приймає лише одну сторону
    Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    double area() {
        return width * height;
    }
}
