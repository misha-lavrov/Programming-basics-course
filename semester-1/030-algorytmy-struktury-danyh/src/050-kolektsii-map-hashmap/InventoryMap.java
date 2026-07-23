// Самостійний челендж: облік товарів на складі - HashMap<String, Integer>,
// ключ - назва товару, значення - кількість.

import java.util.HashMap;

public class InventoryMap {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();

        addStock(inventory, "Зошит", 50);
        addStock(inventory, "Ручка", 100);
        addStock(inventory, "Зошит", 20); // поповнення того самого товару

        System.out.println("Склад: " + inventory);

        removeStock(inventory, "Ручка", 30);
        System.out.println("Після продажу 30 ручок: " + inventory);
    }

    static void addStock(HashMap<String, Integer> inventory, String product, int amount) {
        int currentAmount = inventory.getOrDefault(product, 0); // 0, якщо товару ще немає
        inventory.put(product, currentAmount + amount);
    }

    static void removeStock(HashMap<String, Integer> inventory, String product, int amount) {
        int currentAmount = inventory.getOrDefault(product, 0);
        inventory.put(product, currentAmount - amount);
    }
}
