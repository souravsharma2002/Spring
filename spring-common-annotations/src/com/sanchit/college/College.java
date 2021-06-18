package com.sanchit.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: Sanchit Raina
 */
@Component
public class College {

    @Value("${college.collegeName}")
    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    private Teacher teacher;

    // Constructor injection
    // public College(Principal principal) {
    // this.principal = principal;
    // }

    // Setter injection

    // Setter methods not required if @Autowired used before Class objects
    // public void setPrincipal(Principal principal) {
    // this.principal = principal;
    // }

    // public void setTeacher(Teacher teacher) {
    // this.teacher = teacher;
    // }

    public void test() {
        System.out.println("Everything looks good!");
        System.out.println("College Name: " + collegeName);
        principal.principalInfo();
        teacher.teach();
    }
}
