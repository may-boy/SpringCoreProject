package com.springcore.auto.wire;

public class Employee {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting value..");
        this.address = address;
    }

    public Employee(Address address) {
        this.address = address;
        System.out.println("Constructor called from Employee");
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
