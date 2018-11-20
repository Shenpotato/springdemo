package com.shenpotato.springspel;

/**
 * Created by Shen_potato on 2018/11/17.
 */
public class Car {
    private String brand;
    private double price;
    private double tyrepremiter;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyrepremiter=" + tyrepremiter +
                '}';
    }

    public double getTyrepremiter() {
        return tyrepremiter;
    }

    public void setTyrepremiter(double tyrepremiter) {
        this.tyrepremiter = tyrepremiter;
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
