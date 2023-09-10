package com.in28minutes.learnSpringFramework;

public class MarioGame implements GamingConsole{

    public MarioGame(){

    }
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go into hole");
    }

    public void left(){
        System.out.println("Go left");
    }

    public void right(){
        System.out.println("Accelerate");
    }

}
