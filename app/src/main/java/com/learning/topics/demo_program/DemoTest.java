package com.learning.topics.demo_program;

public class DemoTest extends Thread{

    public  void run(){

        System.out.println("Hello Friends");
    }

    public  static  void  main (String[] args){

        DemoTest demoTest = new DemoTest();
        demoTest.start();
    }
}
