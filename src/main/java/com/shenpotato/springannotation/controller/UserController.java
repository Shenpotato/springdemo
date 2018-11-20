package com.shenpotato.springannotation.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by Shen_potato on 2018/11/20.
 * 模拟表现层
 */
@Controller
public class UserController {
    public void execute(){
        System.out.println("UserController execute...");
    }
}
