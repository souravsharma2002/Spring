package com.sanchit.di;

/**
 * @author: Sanchit Raina
 */
public class Student {
    private int id;
    private String studentName;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
        System.out.println("Constructor called");
    }

    public void displayStudentInfo() {
        System.out.println("Student Info: " + studentName + " " + id);
    }

    // public void setId(int id) {
    // this.id = id;
    // }

    // public void setStudentName(String studentName) {
    // this.studentName = studentName;
    // }
}
