package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class StreamFindExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Find Any student : ");
        Optional<Student> getAnystudent = getAnyStudent(studentList);
        if(getAnystudent.isPresent()) {
            System.out.println(getAnystudent.get());
        }

        System.out.println("Find First student : ");
        Optional<Student> getFirststudent = getFirstStudent(studentList);
        if(getFirststudent.isPresent()) {
            System.out.println(getFirststudent.get());
        }
    }

    public static Optional<Student> getAnyStudent(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> getFirstStudent(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGpa()>=3.5)
                .findFirst();
    }
}
