public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Олена", 20000);
        Manager manager = new Manager("Максим", 20000, 8000);

        System.out.println(employee.name + ": зарплата " + employee.calculateSalary());
        System.out.println(manager.name + ": зарплата " + manager.calculateSalary());
    }
}
