package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {

    private String employeeName;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Employees(String employeeName, List<String> phones, Set<String> addresses, Map<String, String> courses) {
        super();
        this.employeeName = employeeName;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public Employees() {
        super();
    }
}
