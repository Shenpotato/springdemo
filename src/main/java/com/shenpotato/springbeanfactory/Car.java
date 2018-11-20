package com.shenpotato.springbeanfactory;

/**
 * Created by Shen_potato on 2018/11/20.
 */
public class Car {
    private String brand;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(){
        System.out.println("Car test");
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
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
