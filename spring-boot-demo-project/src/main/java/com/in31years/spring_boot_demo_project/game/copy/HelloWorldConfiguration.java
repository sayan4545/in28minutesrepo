package com.in31years.spring_boot_demo_project.game.copy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name, int age) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean 
	public String name() {
		return "Sayan Chatterjee";
	}
	@Bean
	public int age() {
		return 12;
	}
	@Bean
	public Person person(String name, int age) {
		return new Person(name,age);
	}

}
