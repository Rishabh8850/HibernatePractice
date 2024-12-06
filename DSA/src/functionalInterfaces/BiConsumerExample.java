package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        BiConsumer<String ,String> biConsumer = (a,b) -> System.out.println("a : "+ a + " b : "+b);
        biConsumer.accept("Rishabh", "Shukla");
        BiConsumer<Integer, Integer> mul = (a,b) -> System.out.println(a+"*"+b+" = "+a*b);
        mul.accept(5,4);
        printNamesAndActivities();
    }

    public static void printNamesAndActivities() {
        BiConsumer<String, List<String>> namesAndActivitiesConsumer = (name, activity) -> System.out.println(name + " "+ activity);
        studentList.forEach(student -> namesAndActivitiesConsumer.accept(student.getName(),student.getActivities()));
    }
}
