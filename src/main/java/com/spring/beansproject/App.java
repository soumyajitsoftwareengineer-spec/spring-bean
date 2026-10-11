package com.spring.beansproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Student student = applicationContext.getBean(Student.class);
        
        System.out.println(student.getBook().print());
    }
}
