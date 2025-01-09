package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> stList = StudentDataBase.getAllStudents();
    static Predicate<Student> gradePredicate = student -> student.getGradeLevel()>=3;

    static Predicate<Student> gpaPredicate = student -> student.getGpa() >=3.9;

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        System.out.println();
        filterStudentByGpa();
        System.out.println();
        filterStudents();
    }
    public static void filterStudentByGradeLevel() {
        stList.forEach(student -> {
            if(gradePredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa() {
        stList.forEach(student -> {
            if(gpaPredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudents() {
        stList.forEach(student -> {
            if(gradePredicate.and(gpaPredicate).test(student)) {
                System.out.println(student);
            }
        });
    }
}
