public class SquareAbstract extends AbstractShape {
    double side;

    SquareAbstract(double side) {
        super("Квадрат");
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}
