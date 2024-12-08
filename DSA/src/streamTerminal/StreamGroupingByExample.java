package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    /*groupingBy() -> generates HashMap
    groupingBy(classifier) ---> It will generate HashMap having classifier as key
    groupingBy(classifier, downstream) --> It will generates HashMap where classifier is key and downstream as value for key
    groupingBy(classifier, supplier, downstream) --> It will generate supplier Type of Map which has classifier as key and downstream is a value for key
    collectingAndThen(Optional,Optional::get) ---> It will give real Object instead of Optional
     */
    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Students by Gender.");
        System.out.println(groupingByGender(students));
        System.out.println();
        System.out.println("Students after customized grouping by");
        System.out.println(groupingByCustomizedValue(students));
        System.out.println();
        System.out.println("Students having grouped by grade level and gpa");
        System.out.println(groupingBytwoParameter_1(students));
        System.out.print(groupingByHigestGradeEachGender(students));
        System.out.println();
        System.out.println("Student grouped by 3 argument");
        System.out.println(groupingByGpaInLinkedHasMapExample(students));
    }

    public static Map<String, List<Student>> groupingByGender(List<Student> students) {
        return students.stream().collect(groupingBy(Student::getGender));
    }

    public static Map<String , List<Student>> groupingByCustomizedValue(List<Student> studentList) {
        return studentList.stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static Map<Integer, Map<String, List<Student>>> groupingBytwoParameter_1(List<Student> students) {
        return students.stream().collect(groupingBy(Student::getGradeLevel,
                groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding" : "Average")));
    }

    public static Map<String, Student> groupingByHigestGradeEachGender(List<Student> stList) {
        return stList.stream().collect(groupingBy(Student::getGender, collectingAndThen(maxBy(Comparator.comparing(Student::getGradeLevel)),Optional::get)));
    }

    public static Map<Integer, Set<Student>> groupingByGpaInLinkedHasMapExample(List<Student> studentList) {
        return studentList.stream().collect(groupingBy(Student::getGradeLevel, LinkedHashMap::new, toSet()));
    }
}
