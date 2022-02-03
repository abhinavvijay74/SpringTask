package com.example.DemoTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoTaskApplication {

	public static void main(String[] args) {
		Logger logger= LoggerFactory.getLogger(DemoTaskApplication.class);
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("configuration.xml");
		Demo d1=applicationContext.getBean("demo",Demo.class);
		logger.info("accesed"+d1);
		logger.trace("Demo object acessed");
	}

}
