package com.SimpleAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ashutosh on 7/20/2016.

 * Please contact qa.amishra@gmail.com with your queries

 */


@Configuration
public class ApplicationConfiguration {

    @Bean
    public ClassA getClassABean(){
        return new ClassA();
    }

    @Bean
    public ClassB getClassBBean(){
        return new ClassB();
    }

}
