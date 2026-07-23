public class CircleAbstract extends AbstractShape {
    double radius;

    CircleAbstract(double radius) {
        super("Коло");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
