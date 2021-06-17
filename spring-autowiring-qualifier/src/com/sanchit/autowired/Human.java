package com.sanchit.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author: Sanchit Raina
 */
public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public void startPumping() {
        if (heart != null) {
            heart.pump();
        } else {
            System.out.println("You are dead");
        }
    }
}
