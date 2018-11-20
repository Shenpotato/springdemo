package com.shenpotato.springspel;

/**
 * Created by Shen_potato on 2018/11/19.
 */
public class Person {
    private String name;
    private String city;//引用address bean的city属性
    private Car car;
    //根据car的price属性确定Info,当price>=300000,为金领，否则为蓝领
    private String info;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", car=" + car +
                ", info='" + info + '\'' +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
