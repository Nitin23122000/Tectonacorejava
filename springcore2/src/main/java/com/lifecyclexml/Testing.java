package com.lifecyclexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {

		AbstractApplicationContext a= new ClassPathXmlApplicationContext("config5.xml");
		a.registerShutdownHook();
		bean b= (bean)a.getBean("lc1");
		System.out.println(b);
		
		System.out.println("......................");
		
		initthroughInterfce it= (initthroughInterfce)a.getBean("inter");
		System.out.println(it);
		
		System.out.println(".........");
		
		lifecycleannotation lca=(lifecycleannotation) a.getBean("ann");
		System.out.println(lca);
	}

}
