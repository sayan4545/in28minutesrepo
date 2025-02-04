package com.in31years.spring_boot_demo_project.game.copy;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {
	
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			
			
			System.out.println(context.getBean("person"));
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

}
