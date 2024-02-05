package com.springcore.stereotype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
        Student student = context.getBean("student", Student.class);

        System.out.println("Student: " + student);
        System.out.println("Student address: " + student.getAddresses());
        System.out.println(student.getAddresses().getClass().getName());

        System.out.println(student.hashCode());

        //This will provide the same hash in case of singleton
        //because reference of the same object was provided.
        Student student1 = context.getBean("student", Student.class);
        System.out.println(student1.hashCode());

        Burger burger = context.getBean("burger", Burger.class);
        System.out.println(burger.hashCode());

        Burger burger2 = context.getBean("burger", Burger.class);
        System.out.println(burger2.hashCode());
    }

}
