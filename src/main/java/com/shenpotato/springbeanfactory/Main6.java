package com.shenpotato.springbeanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/20.
 */
public class Main6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryContext.xml");
        Car car1 = (Car)applicationContext.getBean("car1");
        System.out.println(car1);

        Car car2=(Car)applicationContext.getBean("car2");
        System.out.println(car2);

    }
}
