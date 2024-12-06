package streamTerminal;

import data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StreamCountingExample {

    public static void main(String[] args) {
        System.out.println("All students");
        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(counting()));
        System.out.println("All Students with Gpa more than 3.9");
        System.out.println(StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting()));
    }
}
