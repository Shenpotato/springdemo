package com.shenpotato.springdemo;

/**
 * Created by Shen_potato on 2018/11/17.
 */
public class Car {
    private String brand;
    private String corp;
    private double price;
    private int maxSpeed;

    public Car(String brand, String corp, double price, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
