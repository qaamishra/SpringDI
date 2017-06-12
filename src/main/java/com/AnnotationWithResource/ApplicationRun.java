package com.AnnotationWithResource;

import javax.annotation.Resource;

/**
 * Created by Ashutosh on 7/20/2016.

 * Please contact mishra.techie@gmail.com with your queries

 */

//@Resource is resource injection from java-runtime rt.jar
//This will fetch the object from the sprint container
public class ApplicationRun {

    @Resource
    private ClassA aObject;

    @Resource
    private ClassB bObject;

    public void runMyApplication(){
        aObject.printMeA();
        bObject.printMeB();
    }

}


