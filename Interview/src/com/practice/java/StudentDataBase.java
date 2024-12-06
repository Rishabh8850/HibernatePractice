package com.practice.java;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
    public static List<Student> getStudents() {
        Student s1 = new Student("Rishabh", 2, "Male", 3.6, Arrays.asList("Cricket","Badminton","Football"));
        Student s2 = new Student("Madhvi", 2, "Female", 3.8,Arrays.asList("Dancing","Badminton"));
        Student s3 = new Student("Shubham", 3, "Male", 4.0,Arrays.asList("Driving","Badminton","Reading"));
        Student s4 = new Student("Priti", 3, "Female", 3.9,Arrays.asList("Badminton","Exploring"));
        Student s5 = new Student("Shraddhey", 4, "Male", 3.5,Arrays.asList("Cricket","Badminton","Football"));
        Student s6 = new Student("Nashat", 4, "Female", 3.9,Arrays.asList("Korian Drama","Reading"));
        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);
        return students;
    }
}
