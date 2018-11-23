package com.shenpotato.springannotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Shen_potato on 2018/11/23.
 */
@Repository
public class UserJdbcRepository implements  UserRepository{
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save...");
    }
}
