package com.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext a= new ClassPathXmlApplicationContext("com/standalonecollection/config8.xml");
		person person=(person) a.getBean("p1");
		System.out.println(person);
		System.out.println(person.getFees());
		System.out.println(person.getFees().getClass().getName());
		System.out.println(person.getProperties());
	}
}
