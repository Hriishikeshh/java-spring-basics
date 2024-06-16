package com.hrishikesh.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02_HelloworldSpring {
	public static void main(String args[]) {
		//1.launch spring context
		var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2.configure the things that we want spring to manage-@configuration
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person")); // 1st way to pass attribute to access data from config file class
		
		
		System.out.println(context.getBean("home"));// 1st way to pass attribute to access data from config file class
		System.out.println(Address.class);
		System.out.println(context.getBean(Address.class));//2nd way to access class methods from config file data
	}
	
	
}
