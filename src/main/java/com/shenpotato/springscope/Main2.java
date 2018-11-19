package com.shenpotato.springscope;

import com.shenpotato.springautowire.Address;
import com.shenpotato.springautowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/19.
 */
public class Main2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopeContext.xml");

        //测试单例singleton
        Car car1 =  (Car)applicationContext.getBean("singletoncar");
        Car car2 =  (Car)applicationContext.getBean("singletoncar");
        System.out.println(car1==car2);

        //测试原型prototype
        Car car3 =  (Car)applicationContext.getBean("prototypecar");
        Car car4=  (Car)applicationContext.getBean("prototypecar");
        System.out.println(car3==car4);
    }
}
