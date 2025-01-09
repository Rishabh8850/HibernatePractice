package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamMatchExample {


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("All Match : "+ allMatch(studentList));
        System.out.println("Any Match : "+anyMatch(studentList));
        System.out.println("None Match : "+noneMatch(studentList));
    }

    public static boolean allMatch(List<Student> students) {
        return students.stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean anyMatch(List<Student> students) {
        return students.stream()
                .anyMatch(student -> student.getGpa()>=4.0);
    }

    public static boolean noneMatch(List<Student> students) {
        return students.stream()
                .noneMatch(student -> student.getGpa()>=4.1);
    }
}
