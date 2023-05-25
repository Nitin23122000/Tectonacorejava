package com.springcore2.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	ApplicationContext a=new ClassPathXmlApplicationContext("config.xml");
		 student student=(student)a.getBean("st1");
		 System.out.println(student);
		 student student2=(student)a.getBean("st2");
		 System.out.println(student2);
		 student student3=(student)a.getBean("st3");
		 System.out.println(student3);
    }
}
