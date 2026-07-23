public class BankAccountExceptionDemo {
    public static void main(String[] args) {
        BankAccountWithExceptions account = new BankAccountWithExceptions(1000);

        try {
            account.withdraw(300);
            System.out.println("Баланс після зняття 300: " + account.getBalance());

            account.withdraw(5000); // це кине InsufficientFundsException
            System.out.println("Цей рядок ніколи не виконається");
        } catch (InsufficientFundsException e) {
            System.out.println("Операція відхилена: " + e.getMessage());
        }

        System.out.println("Фінальний баланс: " + account.getBalance());
    }
}
