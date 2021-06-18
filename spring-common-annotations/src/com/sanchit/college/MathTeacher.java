package com.sanchit.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary /**
          * required to make an Implemented class as Primary, incase of multiple
          * Implemented classes
          */
/**
 * @author: Sanchit Raina
 */
public class MathTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("I'm  a maths teacher!");
    }

}
