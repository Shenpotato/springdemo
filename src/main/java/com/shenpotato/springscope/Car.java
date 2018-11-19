package com.shenpotato.springscope;

/**
 * Created by Shen_potato on 2018/11/19.
 */
public class Car {
    private String brand;
    private double price;

    public Car(){
        System.out.println("test");
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
