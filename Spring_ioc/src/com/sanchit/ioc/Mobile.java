package com.sanchit.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sanchit Raina
 */
public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("Config loaded");

		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}
}
