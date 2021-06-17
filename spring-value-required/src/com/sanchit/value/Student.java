package com.sanchit.value;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: Sanchit Raina
 */
@PropertySource("classpath:info.properties")
public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value("${student.hobby}")
    private String hobby;

    public String getName() {
        return this.name;
    }


    @Required   //If the name is not provided in .properties file, object of class Student won't be created
    public void setName(String name) {
        this.name = name;
    }

    public String getInterestedCourse() {
        return this.interestedCourse;
    }

    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public String getHobby() {
        return this.hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("\nStudent name: " + name);
        System.out.println("\nInterested Course: " + interestedCourse);
        System.out.println("\nHobby: " + hobby);
    }
}
