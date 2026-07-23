public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3),
                new RectangleShape(4, 5),
                new Circle(1)
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println("Площа: " + shape.area());
            totalArea += shape.area();
        }

        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }
}
