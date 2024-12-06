package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int getMultiplactionOfElements(List<Integer> l) {
        return l.stream()
                //1
                //1, a=1,b=1,1*1
                .reduce(1,(a,b) -> a*b);
    }

    public static Optional<Integer> getMultiplactionOfElementsWithOutInitialValue(List<Integer> l) {
        return l.stream().reduce((a,b) -> a*b);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,3,5,7,9);
        System.out.println(getMultiplactionOfElements(intList));
        System.out.println();
        System.out.println(getMultiplactionOfElementsWithOutInitialValue(intList).get());
        System.out.println(getHighestGpaStudent(StudentDataBase.getAllStudents()).get());
    }

    public static Optional<Student> getHighestGpaStudent(List<Student> students) {
        return students.stream().reduce((s1, s2) -> {
            if(s1.getGpa()> s2.getGpa()) {
                return s1;
            } else {
                return s2;
            }
        });
    }
}
