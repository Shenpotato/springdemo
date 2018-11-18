package com.shenpotato.springdemo;

/**
 * Created by Shen_potato on 2018/11/15.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("Hello:"+name);
    }

    public HelloWorld(){
        System.out.println("testconstructor");
    }
}
