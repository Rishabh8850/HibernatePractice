package optional;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOptionalExample {

    public static void main(String[] args) {
        List<Student> listSt = StudentDataBase.getAllStudents();
        Optional<Student> st = getStudentWithSpecificGpa(listSt);
        System.out.println("Students with GPA 4.1 : "+st.isPresent());
        System.out.println(st.isPresent() ? st.get().getName() : "Student is Not Present");
        System.out.println();
        System.out.println("Student Optional");
        System.out.println(getStudentOptional());
        System.out.println(getStudentOptional().isPresent() ? getStudentOptional().get().getName() : "Student is Not Present");
        System.out.println("Student Non Optional");
        System.out.println(getStudent());
        System.out.println(getStudent().getName());
    }

    public static Optional<Student> getStudentWithSpecificGpa(List<Student> students) {
        return students.stream().filter(student -> student.getGpa()==4.1).findFirst();
    }

    public static Optional<Student> getStudentOptional() {
        Student st = null;
        return Optional.ofNullable(st);
    }

    public static Student getStudent() {
        Student st = null;
        return st;
    }
}
