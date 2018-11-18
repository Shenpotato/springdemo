package com.shenpotato.springdemo;

import java.util.Map;

/**
 * Created by Shen_potato on 2018/11/18.
 */
public class NewPerson {
    private String name;
    private int age;
    private Map<String,Car> carMap;

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

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carMap=" + carMap +
                '}';
    }

    public NewPerson(String name, int age, Map<String, Car> carMap) {
        this.name = name;
        this.age = age;
        this.carMap = carMap;
    }
}
