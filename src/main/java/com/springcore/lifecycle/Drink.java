package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drink implements InitializingBean, DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Drink(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price = " + price +
                '}';
    }

    public Drink() {
        super();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //This will work as the init method.
        //will work after the properties are set.
        System.out.println("Init method from second bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Going to destroy second bean'");
    }
}
