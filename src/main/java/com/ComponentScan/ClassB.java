package com.ComponentScan;

import org.springframework.stereotype.Component;

/**
 * Created by Ashutosh on 7/20/2016.

 * Please contact mishra.techie@gmail.com with your queries

 */

/*When you say @Component on the class no need to define a bean ,
it will automatically make a object and give to spring container*/
@Component
public class ClassB {

    public void printMeB(){

        System.out.println("Hello am from classB");
    }
}
