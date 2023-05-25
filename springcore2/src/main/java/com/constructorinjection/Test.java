package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext a= new ClassPathXmlApplicationContext("config4.xml");
		bean b= (bean)a.getBean("b1");
		System.out.println(b);
	}

}
