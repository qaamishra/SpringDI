package com.AnnotwithAutoWire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Ashutosh on 7/20/2016.

 * Please contact mishra.techie@gmail.com with your queries

 */


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
