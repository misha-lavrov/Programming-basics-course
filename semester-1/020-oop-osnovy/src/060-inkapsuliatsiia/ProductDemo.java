public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Зошит", 25.0, 4);

        System.out.println(product.getName() + ": загальна вартість " + product.getTotalCost());

        product.setQuantity(10);
        System.out.println("Після зміни кількості: " + product.getTotalCost());

        product.setPrice(-5); // некоректно - сетер відхилить
        System.out.println("Вартість після спроби встановити від'ємну ціну: " + product.getTotalCost());
    }
}
