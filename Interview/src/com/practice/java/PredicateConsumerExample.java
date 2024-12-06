package com.practice.java;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {
    Predicate<Student> p1 = s -> s.getGpa()>3.9;
    Predicate<Student> p2 = s -> s.getGrade()>2;
    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> c1 = (st -> {
       if(p1.and(p2).test(st)) {
           biConsumer.accept(st.getName(), st.getActivities());
       }
    });

    public void getNameAndActivities(List<Student> students) {
        students.forEach(c1);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getStudents();
        new PredicateConsumerExample().getNameAndActivities(studentList);
    }
}
