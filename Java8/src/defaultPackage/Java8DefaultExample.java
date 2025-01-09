package defaultPackage;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class Java8DefaultExample {

    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    public static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
    public static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Before Sorting : ");
        students.forEach(System.out::println);
        sortByName(students);
        System.out.println();
        sortByGpa(students);
        System.out.println();
        customSorting(students);
        System.out.println();
        nullFirstExample(students);
        System.out.println();
        nullLastExample(students);
    }

    public static void sortByName(List<Student> studentList) {
        studentList.sort(nameComparator);
        System.out.println("After sorting by Name");
        studentList.forEach(System.out::println);
    }

    public static void sortByGpa(List<Student> studentList) {
        studentList.sort(gpaComparator);
        System.out.println("After sorting by GPA");
        studentList.forEach(System.out::println);
    }

    public static void customSorting(List<Student> studentList) {
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        System.out.println("After custom sort");
        studentList.forEach(System.out::println);
    }

    public static void nullFirstExample(List<Student> studentList) {
        System.out.println("Before null First sorting");
        System.out.println(studentList);
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        System.out.println();
        System.out.println("Sort after nullFirst");
        studentList.forEach(System.out::println);
    }

    public static void nullLastExample(List<Student> studentList) {
        System.out.println("Before null Last sorting");
        System.out.println(studentList);
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        System.out.println();
        System.out.println("Sort after nullLast");
        studentList.forEach(System.out::println);
    }
}
