package com.shenpotato.springlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Shen_potato on 2018/11/20.
 */
public class MyBeanPostProcessor implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization:"+o+","+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization:"+o+","+s);
        Car car = new Car();
        car.setBrand("Ford");
        return car;
    }
}
