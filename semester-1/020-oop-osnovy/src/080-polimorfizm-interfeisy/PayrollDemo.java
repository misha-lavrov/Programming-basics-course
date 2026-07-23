// Це і є поліморфізм на практиці: масив типу Payable[] містить РІЗНІ класи
// (FullTimeEmployee і Contractor), але код в циклі звертається до КОЖНОГО
// однаково - через calculatePay() - і кожен об'єкт сам "знає", як порахувати
// СВОЮ оплату. Коду в main() не потрібно знати, з ким саме він працює.

public class PayrollDemo {
    public static void main(String[] args) {
        Payable[] payroll = {
                new FullTimeEmployee("Олена", 25000),
                new Contractor("Максим", 500, 40),
                new FullTimeEmployee("Ірина", 30000)
        };

        double total = 0;
        for (Payable person : payroll) {
            double pay = person.calculatePay();
            System.out.println("Нарахування: " + pay);
            total += pay;
        }

        System.out.println("Загальна сума виплат: " + total);
    }
}
