package com.shenpotato.springrelation;

import com.shenpotato.springautowire.Address;
import com.shenpotato.springautowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/19.
 */
public class Main1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("relationContext.xml");
        //继承
        Address address2 = (Address) applicationContext.getBean("address2");
        System.out.println(address2);
        //依赖
        Person person =(Person)applicationContext.getBean("person");
        System.out.println(person);
    }
}
