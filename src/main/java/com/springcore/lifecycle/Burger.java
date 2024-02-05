package com.springcore.lifecycle;

public class Burger {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting property in first class");
        this.price = price;
    }

    public Burger(double price) {
        this.price = price;
    }

    public Burger() {
        super();
    }

    @Override
    public String toString() {
        return "Burger [price = " + price + " ] ";
    }

    public void hey() {
        System.out.println("Inside init method first class");
    }

    public void bye() {
        System.out.println("Inside destroy method second class");
    }
}
