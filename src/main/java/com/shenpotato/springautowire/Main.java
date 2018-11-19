package com.shenpotato.springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/19.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireContext.xml");
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);
    }
}
