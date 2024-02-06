package com.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{22+11}")
    private int x;
    @Value("#{2>4 ? 55:66}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(241)}")
    private double z;

    //Calling static method.
    @Value("#{T(java.lang.Math).E}")
    private double E;


    //Example of creating an object in Spring expression language.
    @Value("#{ new java.lang.String('Mayank')}")
    private String name;

    @Value("#{ 8>4}")
    private Boolean abc;

    public Boolean getAbc() {
        return abc;
    }

    public void setAbc(Boolean abc) {
        this.abc = abc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", E=" + E +
                ", name='" + name + '\'' +
                ", abc=" + abc +
                '}';
    }
}
