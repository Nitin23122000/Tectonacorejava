package com.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("config3.xml");
		A obj=(A)a.getBean("obj");
		System.out.println(obj.getX());
		System.out.println(obj.getOb().getY());
	}

}
