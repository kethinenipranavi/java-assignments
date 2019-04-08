package com.capgemini.spring.test;
import com.capgemini.spring.messageprovider.*;
import com.capgemini.spring.messagerender.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("beans are not created");
		MessageRenderer renderer= context.getBean(MessageRenderer.class);
		renderer.render();
		System.out.println("Code is running");
		
	}
	
}
