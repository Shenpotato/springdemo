package com.shenpotato.springfactorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/20.
 */
public class Main7 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBeanContext.xml");
        Car car = (Car)applicationContext.getBean("car");
        System.out.println(car);
    }
}
