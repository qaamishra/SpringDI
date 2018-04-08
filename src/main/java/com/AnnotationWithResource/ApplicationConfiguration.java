package com.AnnotationWithResource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Ashutosh on 7/20/2016.

 * Please contact qa.amishra@gmail.com with your queries

 */

/*
 * Instead of xml configuration which is not de-buggable we use java class to define configuration
 * BY adding the tag "@Configuration" on the ApplicationConfiguration class we say that,
 * these all beans(objects) are to be sent to container for dependency injection
 * 
 * @Scope is by default set to singleton ,if you need new object each time the bean is used,
 * you need to set the scope as prototype
 * 
 * */

@Configuration
public class ApplicationConfiguration {

    @Bean//default scope is singleton
    public ApplicationRun getApplicationRunBean(){
        return new ApplicationRun();
    }

    @Bean
    @Scope("prototype")//this will give new object each time.
    public ClassA getClassABean(){
        return new ClassA();
    }

    @Bean
    public ClassB getClassBBean(){
        return new ClassB();
    }

}
