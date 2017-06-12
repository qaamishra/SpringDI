package com.AnnotwithAutoWire;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by Ashutosh on 7/20/2016.

 * Please contact mishra.techie@gmail.com with your queries

 */

/*
 * @Autowired will tell the spring container to give me the object of the ClassA and ClassB
 * 
 * */

public class ApplicationRun {

    @Autowired 
    private ClassA aObject;

    @Autowired
    private ClassB bObject;

    public void runMyApplication(){
        aObject.printMeA();
        bObject.printMeB();
    }

}


