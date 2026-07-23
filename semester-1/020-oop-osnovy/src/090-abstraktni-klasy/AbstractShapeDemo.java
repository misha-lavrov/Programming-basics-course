public class AbstractShapeDemo {
    public static void main(String[] args) {
        AbstractShape[] shapes = {
                new CircleAbstract(2),
                new SquareAbstract(4)
        };

        for (AbstractShape shape : shapes) {
            shape.printInfo(); // метод, який ми НЕ писали ні в CircleAbstract, ні в SquareAbstract -
                                // він успадкований від AbstractShape і однаковий для обох
        }
    }
}
