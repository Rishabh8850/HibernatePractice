package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    private static List<Student> stList = StudentDataBase.getAllStudents();

    static Consumer<Student> nameConsumer = st -> System.out.print(st.getName());
    static Consumer<Student> activityConsumer = st -> System.out.println(st.getActivities());

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("rishabh");
        printNames();
        System.out.println();
        printNamesAndActivities();
        System.out.println();
        printNamesAndActivitiesUsingCondition();
    }

    public static void printNames() {
        stList.forEach(nameConsumer);
    }

    public static void printNamesAndActivities() {
        stList.forEach(nameConsumer.andThen(activityConsumer));
    }

    public static void printNamesAndActivitiesUsingCondition() {
        stList.forEach(student -> {
            if(student.getGradeLevel()>=3) {
                nameConsumer.andThen(activityConsumer).accept(student);
            }
        });
    }
}
