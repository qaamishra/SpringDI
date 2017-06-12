package com.AnnotationWithResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ashutosh on 7/20/2016.

 * Please contact mishra.techie@gmail.com with your queries

 */

/*
 * We need to first set the application context,which will say what is my configuration where are my beans.
 * So the beans are defined in the ApplicationConfiguration.class
 * 
 * And the the class ApplicationRun I want to call the method runMyApplication() 
 * so the object reference variable will need the bean of ApplicationRun class also which only application context can provide
 * */
public class ClassCMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        ApplicationRun applicationRun = applicationContext.getBean(ApplicationRun.class);
        applicationRun.runMyApplication();

    }
}
