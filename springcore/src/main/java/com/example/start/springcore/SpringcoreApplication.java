package com.example.start.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoreApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context =SpringApplication.run(SpringcoreApplication.class, args);
		Alien obj=context.getBean(Alien.class);
		obj.display();
		obj.age=15;
		System.out.println(obj.age);

		Alien obj1=context.getBean(Alien.class);
		obj1.display();
		obj1.age=45;
		System.out.println(obj1.age);
	}

}
