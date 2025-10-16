package com.example.demo.entity;

public class Student {
    private String firstName;

    private String firstLame;

    public Student() {
    }

    public Student(String firstName, String firstLame) {
        this.firstName = firstName;
        this.firstLame = firstLame;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstLame() {
        return firstLame;
    }

    public void setFirstLame(String firstLame) {
        this.firstLame = firstLame;
    }
}
