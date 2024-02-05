package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student1");

        System.out.println(student);

        Student student2 = (Student) context.getBean("student2");

        System.out.println("Student 2: " + student2);

        Student student3 = (Student) context.getBean("student3");

        System.out.println(student3);
        //For the p namespace in the config.xml the Intellij shows an error but it actually works as shown in
        //student3 bean.
    }
}