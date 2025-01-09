package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamMappingExample {

    /* mapping is used to convert one form of object to another
       mapping takes 2 attributes one in which from we need to change and 2nd in which collection we want to store it
       mapping(mapper, collector)
     */
    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println();
        System.out.println(StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa()>=3.9)
                .collect(Collectors.mapping(Student::getName, Collectors.toList())));
    }
}
