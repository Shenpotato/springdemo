package com.shenpotato.springlifecycle;

/**
 * Created by Shen_potato on 2018/11/20.
 */
public class Car {
    public Car(){
        System.out.println("carconstructor test");
    }

    private String brand;

    public void setBrand(String brand) {
        System.out.println("carsetmethod test");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void init(){
        System.out.println("init test");
    }

    public void destory(){
        System.out.println("destory test");
    }
}
