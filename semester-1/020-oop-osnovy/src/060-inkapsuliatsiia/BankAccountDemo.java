public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        System.out.println("Баланс після поповнення: " + account.getBalance());

        account.withdraw(2000); // забагато - метод сам відхилить операцію
        System.out.println("Баланс після спроби зайвого зняття: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Баланс після зняття: " + account.getBalance());

        // account.balance = -999999; // <- так НЕ можна: поле private,
        // цей рядок навіть не скомпілюється, якщо розкоментувати
    }
}
