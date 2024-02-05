package com.springcore.ci;

public class Person {

    private String name;
    private int personId;
    private Certi certi;
    public Person(String name, int personid, Certi certi) {
        this.name = name;
        this.personId = personid;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.personId + " { " +
                this.certi.name;
    }

}
