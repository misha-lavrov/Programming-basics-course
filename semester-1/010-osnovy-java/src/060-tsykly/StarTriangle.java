// Челендж: трикутник із зірочок за допомогою вкладених циклів.

public class StarTriangle {
    public static void main(String[] args) {
        int height = 5;

        for (int row = 1; row <= height; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(); // перехід на новий рядок після кожного ряду зірочок
        }
    }
}
