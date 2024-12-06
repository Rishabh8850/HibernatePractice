package com.practice.java;

import java.util.List;

public class Student {
    private String name;
    private int grade;
    private String gender;
    private double gpa;

    private List<String> activities;

    public Student(String name, int grade, String gender, double gpa, List<String> activities) {
        this.name = name;
        this.grade = grade;
        this.gender = gender;
        this.gpa = gpa;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", activities=" + activities +
                '}';
    }
}
