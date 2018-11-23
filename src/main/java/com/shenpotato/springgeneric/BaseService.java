package com.shenpotato.springgeneric;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Shen_potato on 2018/11/23.
 */
public class BaseService<T> {

    @Autowired
    protected  BaseRepository<T> repository;

    public void add(){
        System.out.println("add....");
        System.out.println(repository);
    }
}
