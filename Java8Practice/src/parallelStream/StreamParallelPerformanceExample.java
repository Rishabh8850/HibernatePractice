package parallelStream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamParallelPerformanceExample {

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        seqentialGetStudentActivities(students);
        parallallyGetStudentActivities(students);
    }

    public static List<String> seqentialGetStudentActivities(List<Student> students) {
        long startTime = System.currentTimeMillis();
        List<String> activities = students.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for getting activities Sequentially : " + (endTime-startTime));
        return activities;
    }

    public static List<String> parallallyGetStudentActivities(List<Student> students) {
        long startTime = System.currentTimeMillis();
        List<String> activities = students.stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for getting activities Parallaly : " + (endTime-startTime));
        return activities;
    }
}
