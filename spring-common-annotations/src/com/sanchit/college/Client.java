package com.sanchit.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Sanchit Raina
 */
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        (context.getBean("college", College.class)).test();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
