package com.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext a=new AnnotationConfigApplicationContext(javaconfig.class);
		 bean b=(bean) a.getBean("nitin");
		 System.out.println(b);
		
		 
		
		
	}
}
