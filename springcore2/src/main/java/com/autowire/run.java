package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {
	
	public static void main(String[] args) {
		
		ApplicationContext a= new ClassPathXmlApplicationContext("config6.xml");
		emp ep=(emp) a.getBean("emp1");
		System.out.println(ep);
	}

}
