package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StramsComparatorExample {

    public static void main(String[] args) {
        System.out.println("Sorted By Name : ");
        sortStudentByName().forEach(System.out::println);
        System.out.println("Sorted by GPA : ");
        sortStudentByGpa().forEach(System.out::println);
    }

    public static List<Student> sortStudentByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
}
