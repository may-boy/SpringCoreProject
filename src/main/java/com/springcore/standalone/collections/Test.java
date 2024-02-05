package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
        Person person = context.getBean("person3", Person.class);

        System.out.println("Person: " + person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println("______________________________________");
        System.out.println("Fee Structure: " + person.getFeeStructure());
        System.out.println(person.getFeeStructure().getClass().getName());
        System.out.println("______________________________________");
        System.out.println("Properties: " + person.getProperties());
        System.out.println(person.getProperties().getClass().getName());
    }

}
