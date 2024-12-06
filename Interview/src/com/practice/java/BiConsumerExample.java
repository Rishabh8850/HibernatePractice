package com.practice.java;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("mul : " + a+b);
        BiConsumer<Integer, Integer> division = (a,b) -> System.out.println("div : " + a/b);
        multiply.andThen(division).accept(6,3);
        studentAndActivities();
    }

    public static void studentAndActivities() {
        BiConsumer<String, List<String>> listBiConsumer = (name,activities) -> System.out.println(name + " : " + activities);
        List<Student> st = StudentDataBase.getStudents();
        st.forEach(student -> listBiConsumer.accept(student.getName(), student.getActivities()));
    }
}
