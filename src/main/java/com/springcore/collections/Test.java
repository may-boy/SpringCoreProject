package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");

        Employees obj = (Employees) context.getBean("emp1");
        System.out.println("Employee name: " + obj.getEmployeeName());
        System.out.println("Phone number: " + obj.getPhones());
        System.out.println("Addresses: " + obj.getAddresses());
        System.out.println("Courses: " + obj.getCourses());

        //Checking the list returned by list tag by default.
        System.out.println(obj.getPhones().getClass().getName());
    }

}
