package com.shenpotato.springgeneric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/23.
 */
public class Main9 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("genericContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.add();
    }


}
