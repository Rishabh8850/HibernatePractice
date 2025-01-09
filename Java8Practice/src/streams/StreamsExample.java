package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                        .peek(st -> System.out.println(st)) // used to debug
                .collect(Collectors.toMap(Student::getName, Student::getActivities)));
    String s = "Rishabh";
    }
}
