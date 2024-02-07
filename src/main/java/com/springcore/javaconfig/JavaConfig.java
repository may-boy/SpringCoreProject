package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

    //We can also provide an array of names of bean.
    //Example: @Bean(name = {"student","temp"})
    @Bean
    public Burger getBurger () {
        return new Burger();
    }

    //Creating a new Student object.
    @Bean
    public Student getStudents() {
        return new Student(getBurger());
    }

}
