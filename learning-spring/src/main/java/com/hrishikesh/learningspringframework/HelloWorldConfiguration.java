package com.hrishikesh.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person (String name,int age,Address address) {}
record Address(String address,String firstline) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "configuration class data retrieved using context.getBean";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		return new Person("hrishi",20,new Address("main street","lllllllllll"));  //return new Person used new here!!
	}
	
	@Bean(name="home")
	public Address address() {
		return new Address("pict,pune","lmao!!");
	}
	
	@Bean
	public Person person2methodcall() {
		return new Person(name(),age(),address());  //return new Person used new here!!
	}
	
	
}
