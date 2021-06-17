package com.sanchit.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Sanchit Raina
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.getBean("student", Student.class).displayStudentInfo();
        ((AbstractApplicationContext) context).close();
    }
}
