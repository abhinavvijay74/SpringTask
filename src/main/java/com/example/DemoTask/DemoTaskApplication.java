package com.example.DemoTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoTaskApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("configuration.xml");
		Demo d1=applicationContext.getBean("demo",Demo.class);
		System.out.println(d1);
	}

}
