package com.example.start.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Alien {
@Autowired
    Laptop lap;
int age;
    public void display(){
//        System.out.println("This is the first Java project");
        lap.compile();
    }
}
