package com.shenpotato.springannotation.repository;

import com.shenpotato.springannotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Shen_potato on 2018/11/20.
 * 模拟持久层
 */
@Repository("userRepository")
public class UserRepositoryImpl implements  UserRepository{
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepository Save...");
        System.out.println(testObject);
    }
}
