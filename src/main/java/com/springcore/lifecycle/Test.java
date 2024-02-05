package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.task.support.ExecutorServiceAdapter;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();
//
//        Burger burger = (Burger) context.getBean("burger");
//        System.out.println(burger);
//
//        System.out.println("---------------------------");
//
//        Drink drink = (Drink) context.getBean("drink");
//        System.out.println(drink);

        Bottle example = (Bottle) context.getBean("bottle");

        System.out.println(example);
    }

}
