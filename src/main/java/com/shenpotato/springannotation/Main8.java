package com.shenpotato.springannotation;

import com.shenpotato.springannotation.controller.UserController;
import com.shenpotato.springannotation.repository.UserRepository;
import com.shenpotato.springannotation.service.UserService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shen_potato on 2018/11/23.
 */
public class Main8 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationContext.xml");

        /*@Component,@Controller,@Service,@Reposity测试
        TestObject testObject = (TestObject) applicationContext.getBean("testObject");
        System.out.println(testObject);

        UserController userController = (UserController)applicationContext.getBean("userController");
        System.out.println(userController);

        UserService userService = (UserService)applicationContext.getBean("userService");
        System.out.println(userService);

        UserRepository userRepository = (UserRepository)applicationContext.getBean("userRepository");
        System.out.println(userRepository);
        */

        UserController userController = (UserController)applicationContext.getBean("userController");
        System.out.println(userController);
        userController.execute();

    }
}
