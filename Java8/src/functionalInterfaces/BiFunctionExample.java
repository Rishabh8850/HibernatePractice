package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentGpaBiFunction = (students, studentPredicate) -> {
        Map<String, Double> stGpaMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)) {
                stGpaMap.put(student.getName(), student.getGpa());
            }
        });
        return stGpaMap;
    };

    public static void main(String[] args) {
        System.out.println(studentGpaBiFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.gpaPredicate));
    }
}
