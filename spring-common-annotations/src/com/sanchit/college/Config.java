package com.sanchit.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: Sanchit Raina
 * 
 *          @ComponentScan("com.sanchit.college") Required only if @Bean not
 *          mentioned
 */
@Configuration
@ComponentScan("com.sanchit.college")
@PropertySource("info.properties")
public class Config {
    /*
     * @Bean public Principal principal() { return new Principal(); }
     * 
     * @Bean public Teacher mathTeacher() { return new MathTeacher(); }
     * 
     * 
     * can override default beanName, here
     * 
     * @Bean("BEAN_NAME") public College college() { // here, college is the
     * beanName,as it was previously done in config.xml file // return new
     * College(principal()); College college = new College();
     * college.setPrincipal(principal()); college.setTeacher(mathTeacher()); return
     * college; }
     */
}
