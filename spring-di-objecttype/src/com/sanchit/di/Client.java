package com.sanchit.di;

import org.springframework.context.*;
import org.springframework.context.support.*;

/**
 * @author: Sanchit Raina
 */
public class Client {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        (context.getBean("student", Student.class)).cheating();
        ((AbstractApplicationContext) context).close();
    }
}