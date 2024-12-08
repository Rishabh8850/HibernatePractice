package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOptionalMapExample {
    public static void main(String[] args) {
        optionalMapExample();
        optionalFilterExample();
        System.out.println();
        FlatMapExample();
    }

    public static void optionalMapExample() {
        Optional<List<Student>> optionalStudents = Optional.ofNullable(StudentDataBase.getAllStudents());
        System.out.println(optionalStudents
                .map(students -> students.stream().collect(Collectors.toList())));
    }

    public static void optionalFilterExample() {
        Optional<List<Student>> optionalStudents = Optional.ofNullable(StudentDataBase.getAllStudents());
        optionalStudents
                .map(students -> students
                        .stream()
                        .filter(student -> student.getGpa()>=3.5)
                        .findFirst()
                        .get())
                .filter(student -> student.getGpa()>=3.5).ifPresent(s -> System.out.print(s.getName()));
    }

    public static void FlatMapExample() {
        Optional<Student> optionalStudents = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> bikeName = optionalStudents
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        System.out.println(bikeName.get());
    }
}
