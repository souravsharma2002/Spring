package com.sanchit.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Sanchit Raina
 */
public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        (context.getBean("student", Student.class)).displayStudentInfo();
        (context.getBean("kaka", Student.class)).displayStudentInfo();
    }
}
