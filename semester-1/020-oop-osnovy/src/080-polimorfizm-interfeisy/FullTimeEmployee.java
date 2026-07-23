public class FullTimeEmployee implements Payable {
    String name;
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary; // штатний співробітник отримує фіксовану ставку
    }
}
