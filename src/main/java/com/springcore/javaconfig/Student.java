package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//We can also explicitly define the name of the bean in @Component.
@Component("student")
public class Student {

    private Burger burger;

    public Student(Burger burger) {
        this.burger = burger;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public void study() {
        this.burger.display();
        System.out.println("Student is reading a book.");
    }

}
