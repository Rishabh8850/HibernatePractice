package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList()));
        System.out.println();
        System.out.println(totalNumberOfActivities());
        System.out.println();
        System.out.println(totalNumberOfActivitiesInSortedOrder());
    }

    public static long totalNumberOfActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static List<String> totalNumberOfActivitiesInSortedOrder() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted().collect(Collectors.toList());
    }
}
