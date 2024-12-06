package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    Predicate<Student> gradePredicate = s -> s.getGradeLevel() >=3;
    Predicate<Student> gpaPredicate = s -> s.getGpa() >=3.9;

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " " + activities);
    Consumer<Student> consumer = student -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    List<Student> stList = StudentDataBase.getAllStudents();

    public void printNameAndActivity() {
        stList.forEach(consumer);
    }

    public static void main(String[] args) {
        PredicateConsumerExample predicateConsumerExample = new PredicateConsumerExample();
        predicateConsumerExample.printNameAndActivity();
    }
}
