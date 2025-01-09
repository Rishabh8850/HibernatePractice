package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionalStudentExample {

    static Function<List<Student>, Map<String, Double>> studentGpaFunction = students -> {
        Map<String, Double> studentGpaMap = new HashMap<>();
        students.forEach(st -> studentGpaMap.put(st.getName(), st.getGpa()));
        return studentGpaMap;
    };
    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        System.out.println(getStudentGpaMap());
    }

    public static Map<String, Double> getStudentGpaMap() {
        return studentGpaFunction.apply(studentList);
    }
}
