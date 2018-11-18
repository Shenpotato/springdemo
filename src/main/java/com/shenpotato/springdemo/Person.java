package com.shenpotato.springdemo;

import java.util.List;

/**
 * Created by Shen_potato on 2018/11/17.
 */
public class Person {
    private String name;
    private int age;
    //private Car car;//当car为单量时
    private List<Car> cars;//当car数量大于1时

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*当车为一辆时
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    */

    public List<Car> getCar() {
        return cars;
    }

    public void setCar(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + cars+
                '}';
    }
}
