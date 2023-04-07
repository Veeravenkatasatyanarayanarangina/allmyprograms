package com.motivity;

import java.util.Map;

public class Student
{
    private int id;
    private String name;
    private int marks;
    private Map courses;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Map getCourses() {
        return courses;
    }

    public void setCourses(Map courses) {
        this.courses = courses;
    }

    public Student(int id, String name, int marks, Map courses) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.courses = courses;
    }
}
