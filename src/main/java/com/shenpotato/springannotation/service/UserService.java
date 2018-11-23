package com.shenpotato.springannotation.service;

import com.shenpotato.springannotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Shen_potato on 2018/11/20.
 * 模拟业务层
 */
@Service
public class UserService {
    @Autowired
    //@Qualifier("userRepositoryImpl")
    private UserRepository userRepository;

    //@Qualifier("userRepositoryImpl")
    public void setUserRepository( @Qualifier("userRepositoryImpl") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(){
        System.out.println("UserService add...");
        userRepository.save();
    }
}
