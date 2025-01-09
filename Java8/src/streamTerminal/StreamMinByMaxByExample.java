package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMinByMaxByExample {

    public static void main(String[] args) {

        //minBy and maxBy function takes Comparator as i/p and output would be Optional
        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    }
}
