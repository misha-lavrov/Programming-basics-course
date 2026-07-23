public class Contractor implements Payable {
    String name;
    double hourlyRate;
    int hoursWorked;

    Contractor(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; // контрактник отримує оплату за години
    }
}
