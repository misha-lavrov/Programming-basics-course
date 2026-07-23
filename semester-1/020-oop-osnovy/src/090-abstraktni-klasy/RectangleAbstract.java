// Приклад розв'язку челенджу: додати ще одну фігуру - прямокутник - до
// ієрархії AbstractShape. Для звірки після самостійної спроби студентів.

public class RectangleAbstract extends AbstractShape {
    double width;
    double height;

    RectangleAbstract(double width, double height) {
        super("Прямокутник");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
