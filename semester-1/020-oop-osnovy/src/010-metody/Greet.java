// Демонстрація: метод без параметрів і без результату (void), потім метод з параметром.

public class Greet {
    public static void main(String[] args) {
        sayHello();          // виклик методу без параметрів
        greetByName("Олена"); // виклик методу з параметром
        greetByName("Максим");
    }

    // void означає, що метод нічого не повертає - лише виконує дію
    static void sayHello() {
        System.out.println("Привіт!");
    }

    // String name - параметр: значення, яке метод отримує ззовні при виклику
    static void greetByName(String name) {
        System.out.println("Привіт, " + name + "!");
    }
}
