package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamPartinioningByExample {

    /* partitioningBy() --> It will take predicate as argument and used to create map of key boolean and value
    partitioningBy(predicate)
    partitioningBy(predicate, downstream)
     */
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(partitioningByGPA(studentList));
        System.out.println();
        System.out.println("partitioning to get Highest GPA.");
        System.out.println(partitioningByHighestGPA(studentList));
    }

    public static Map<Boolean, List<Student>> partitioningByGPA(List<Student> stList) {
        return stList.stream().collect(partitioningBy(student -> student.getGpa()>=3.9));
    }

    public static Map<Boolean, Student> partitioningByHighestGPA(List<Student> ll) {
        return ll.stream().collect(partitioningBy(student -> student.getGender().equals("female"), collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }
}
