package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamJoinningExample {

   /* joinning used to concatenate strings
    has 3 versions
    1. joinning() --> concatenate all the string
    2. joinning(delimeter) --> concatenate all the string with delimeter mentioned
    3. joinning(delimeter, prefix, suffix) --> concatenate all the string with delimeter mentioned and wrap result with prefix and suffix */
    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Joinning_1 : "+ joinning1(students));
        System.out.println("Joinning_2 : "+ joinning2(students));
        System.out.println("Joinning_3 : "+ joinning3(students));
    }

    public static String joinning1(List<Student> studentList) {
        return studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joinning2(List<Student> studentList) {
        return studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

    public static String joinning3(List<Student> studentList) {
        return studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ","(",")"));
    }
}
