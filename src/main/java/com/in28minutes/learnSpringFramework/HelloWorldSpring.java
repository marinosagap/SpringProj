package com.in28minutes.learnSpringFramework;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
    public static void main(String [] args){
        //1. Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring to manage - @Configuration
        //Retrieving beans managed by Spring
        System.out.println(context.getBean("name"));
    }
}
