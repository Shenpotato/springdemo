package com.shenpotato.springannotation.service;

import org.springframework.stereotype.Service;

/**
 * Created by Shen_potato on 2018/11/20.
 * 模拟业务层
 */
@Service
public class UserService {
    public void add(){
        System.out.println("UserService add...");
    }
}
