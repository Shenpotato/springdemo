package com.shenpotato.springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/20.
 */
public class Main5 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycleContext.xml");

        Car car = (Car)applicationContext.getBean("car");

        System.out.println(car);

        applicationContext.close();
    }
}
