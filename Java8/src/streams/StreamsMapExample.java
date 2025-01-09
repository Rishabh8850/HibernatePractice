package streams;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList()));
    }
}
