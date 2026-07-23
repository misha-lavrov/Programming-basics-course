// Самостійний челендж: успадкування на прикладі, ближчому до реального
// бізнес-коду (а не тварин/машин) - Employee/Manager.

public class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}
