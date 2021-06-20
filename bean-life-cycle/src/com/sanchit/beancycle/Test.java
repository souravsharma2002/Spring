package com.sanchit.beancycle;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Sanchit Raina
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        DatabaseDAO dao = context.getBean("database", DatabaseDAO.class);
        Scanner scanner = new Scanner(System.in);
        int choice;
        String id;
        System.out.println("1. SELECT ALL AVAILIBILITY");
        System.out.println("2. DELETE AN AVAILIBILITY");
        System.out.println("Enter a choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                dao.selectAllRows();
                break;
            case 2:
                System.out.println("Enter an id you want to delete");
                id = scanner.next();
                dao.deleteRecord(id);
                break;
            default:
                System.out.println("No such case");
        }
        ((AbstractApplicationContext) context).close();
        scanner.close();
    }
}
