// Самостійний челендж: власний (custom) виняток. Успадковуємо Exception,
// щоб отримати СВІЙ, змістовно названий тип помилки замість загального
// RuntimeException.

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // передаємо повідомлення про помилку батьківському класу Exception
    }
}
