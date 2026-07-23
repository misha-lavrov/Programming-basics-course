// Самостійний челендж: ArrayList<Student> (об'єкти, а не примітиви) +
// сортування за оцінкою за допомогою Comparator.
//
// Collections.sort САМ не знає, як порівнювати об'єкти Student (на відміну
// від чисел чи рядків) - тому треба явно сказати, ЗА ЯКИМ полем порівнювати.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentListSorting {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Олена", 92));
        students.add(new Student("Максим", 68));
        students.add(new Student("Ірина", 85));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                return first.grade - second.grade; // за зростанням оцінки
            }
        });

        System.out.println("Студенти за зростанням оцінки:");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.grade);
        }
    }
}
