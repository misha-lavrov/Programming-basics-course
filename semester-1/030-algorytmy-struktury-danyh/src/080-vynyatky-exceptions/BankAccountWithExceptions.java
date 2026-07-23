// Порівняйте з BankAccount.java з блоку 2: там withdraw() просто друкувало
// повідомлення і повертало керування. Тепер withdraw() КИДАЄ (throws)
// власний виняток - і той, хто викликає метод, ЗОБОВ'ЯЗАНИЙ його обробити.

public class BankAccountWithExceptions {
    private double balance;

    BankAccountWithExceptions(double initialBalance) {
        this.balance = initialBalance;
    }

    // "throws InsufficientFundsException" у сигнатурі методу - попередження
    // для будь-якого коду, що викликає withdraw(): "я можу кинути цей виняток,
    // будь готовий його обробити".
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Недостатньо коштів: на рахунку " + balance + ", а треба " + amount);
        }
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}
