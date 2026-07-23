// Демонстрація інкапсуляції: чому поле balance - private, а не public.
//
// Якби balance було public, будь-який код міг би написати
// account.balance = -1000000; напряму, минаючи будь-яку перевірку.
// private + методи deposit()/withdraw() - це і є "захист" даних об'єкта:
// змінити баланс можна ЛИШЕ через методи, які контролюють, що це коректно.

public class BankAccount {
    private double balance; // private - доступне лише всередині цього класу

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Сума поповнення має бути додатною.");
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сума зняття має бути додатною.");
            return;
        }
        if (amount > balance) {
            System.out.println("Недостатньо коштів на рахунку.");
            return;
        }
        balance -= amount;
    }

    // Гетер (getter) - єдиний спосіб ЗЗОВНІ дізнатись баланс
    double getBalance() {
        return balance;
    }
}
