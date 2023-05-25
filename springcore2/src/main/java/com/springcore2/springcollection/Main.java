package com.springcore2.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext a= new  ClassPathXmlApplicationContext("config2.xml");
		springcollection spc=(springcollection)a.getBean("exm1");
		System.out.println(spc.getName());
		System.out.println(spc.getCourses());
		System.out.println(spc.getAddress());
		System.out.println(spc.getProps());
	}

}
