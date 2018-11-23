package com.shenpotato.springannotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Shen_potato on 2018/11/20.
 * 模拟持久层
 */
@Repository("userRepository")
public class UserRepositoryImpl implements  UserRepository{
    @Override
    public void save() {
        System.out.println("UserRepository Save...");
    }
}
