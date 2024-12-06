import com.practice.java.Student;
import com.practice.java.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
    static Consumer<Student> st = student -> System.out.println(student.getName());
    static Consumer<Student> hb = student -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        c1.accept("Rishabh");
        printStudent();
        printStudentHobbies();
        printStudentsWithConditions();
    }

    private static void printStudentsWithConditions() {
        System.out.println("Conditions .............");
        List<Student> studentList = StudentDataBase.getStudents();
        studentList.stream().forEach(stu -> {
            if(stu.getGpa()>=3.9 && stu.getGrade()> 3) {
                st.andThen(hb).accept(stu);
            }
        });
    }

    public static void printStudentHobbies() {
        Consumer<Student> st = student -> System.out.println(student.getName());
        Consumer<Student> hb = student -> System.out.println(student.getActivities());
        List<Student> studentList = StudentDataBase.getStudents();
        studentList.stream().forEach(st.andThen(hb));
    }

    public static void printStudent() {
        List<Student> studentList = StudentDataBase.getStudents();
        studentList.stream().forEach(st);
    }
}
