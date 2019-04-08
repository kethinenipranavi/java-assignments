package com.capgemini.spring.test;
import com.capgemini.spring.annotation.*;
import com.capgemini.spring.messageprovider.*;
import com.capgemini.spring.messagerender.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{
	public static void main(String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println("Beans are created");
		MessageRenderer messageRenderer=context.getBean(MessageRenderer.class);
		messageRenderer.render();
		System.out.println("working");
		MessageRenderer renderer1= context.getBean(MessageRenderer.class);
		int hashcode1=messageRenderer.hashCode();
		int hashcode2=renderer1.hashCode();
		if(hashcode1 == hashcode2){
			System.out.println("singleton class");
		}
		else {
			System.out.println("Not a singleton Class");
		}
	}
	
}
