package com.sanchit.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author: Sanchit Raina
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        College clg = (context.getBean("college", College.class));
        System.out.println("College object created by spring is: " + clg);
        ((AbstractApplicationContext) context).close();
    }
}
