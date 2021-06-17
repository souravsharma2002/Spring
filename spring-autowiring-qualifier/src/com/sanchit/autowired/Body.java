package com.sanchit.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Sanchit Raina
 */
public class Body {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.getBean("human", Human.class).startPumping();
        ((AbstractXmlApplicationContext) context).close();
    }
}
