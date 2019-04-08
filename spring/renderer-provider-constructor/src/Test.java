package com.capgemini.spring.test;

import com.capgemini.spring.messagerenderer.*;
import com.capgemini.spring.messageprovider.*;
import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext;



	public class Test {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("WOW");
		MessageRenderer renderer = (MessageRenderer)context.getBean("renderer");
		renderer.renderer();
}
}