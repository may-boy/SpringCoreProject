package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");

        Employee employee = context.getBean("emp",Employee.class);

        System.out.println(employee);
    }

}
//provide a way to print all the resource in API gateway in java by calling a method with the name getAllResourcesInA