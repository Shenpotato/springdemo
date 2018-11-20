package com.shenpotato.springspel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/19.
 */
public class Main4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spelContext.xml");
        Address address = (Address)applicationContext.getBean("address");
        System.out.println(address);

        Car car = (Car)applicationContext.getBean("car");
        System.out.println(car);

        Person person =(Person)applicationContext.getBean("person");
        System.out.println(person);
    }
}
