package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSumAvgExample {

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Sum of all grades : " + sum(students));
        System.out.println("Avg of all grades : "+ avg(students));
    }

    public static int sum(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.summingInt(Student::getGradeLevel));
    }

    public static double avg(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.averagingInt(Student::getGradeLevel));
    }
}
