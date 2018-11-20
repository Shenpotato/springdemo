package com.shenpotato.springfactorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Shen_potato on 2018/11/20.
 * 需要实现FactoryBean接口
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //返回Bean的对象
    @Override
    public Car getObject() throws Exception {
        return new Car("BMW",500000);
    }

    //返回Bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    //返回是不是单实例的
    @Override
    public boolean isSingleton() {
        return true;
    }
}
