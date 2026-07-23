// Челендж: масив ОБ'ЄКТІВ Student + порахувати середній бал + вивести
// імена студентів з балом вище середнього.

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].name = "Олена";
        students[0].grade = 92;

        students[1] = new Student();
        students[1].name = "Максим";
        students[1].grade = 68;

        students[2] = new Student();
        students[2].name = "Ірина";
        students[2].grade = 85;

        int sum = 0;
        for (Student student : students) {
            sum += student.grade;
        }
        double average = (double) sum / students.length;
        System.out.println("Середній бал групи: " + average);

        System.out.println("Студенти з балом вище середнього:");
        for (Student student : students) {
            if (student.grade > average) {
                System.out.println("- " + student.name + " (" + student.grade + ")");
            }
        }
    }
}
