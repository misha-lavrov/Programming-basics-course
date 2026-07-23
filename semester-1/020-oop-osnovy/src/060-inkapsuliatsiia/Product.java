// Самостійний челендж: private поля price і quantity з валідацією
// в сетерах, і метод, що рахує загальну вартість.

public class Product {
    private String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void setPrice(double price) {
        if (price < 0) {
            System.out.println("Ціна не може бути від'ємною.");
            return;
        }
        this.price = price;
    }

    void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Кількість не може бути від'ємною.");
            return;
        }
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    String getName() {
        return name;
    }
}
