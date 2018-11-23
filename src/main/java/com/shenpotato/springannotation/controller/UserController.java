package com.shenpotato.springannotation.controller;

import com.shenpotato.springannotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Shen_potato on 2018/11/20.
 * 模拟表现层
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void execute(){
        System.out.println("UserController execute...");
        userService.add();
    }
}
