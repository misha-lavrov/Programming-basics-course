public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        Rectangle square = new Rectangle(3.0); // викличе конструктор для квадрата

        System.out.println("Площа прямокутника: " + rectangle.area());
        System.out.println("Площа квадрата: " + square.area());
    }
}
