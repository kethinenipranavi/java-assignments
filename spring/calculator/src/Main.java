package com.capgemini.spring.test;
import com.capgemini.spring.math.*;


import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext;



	public class Main {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		try{
		Calculator calculator = context.getBean(Calculator.class);
		calculator.add(100,100);
		calculator.division(25.0,5.0);
}
	catch(ArithmeticException error) {
	System.out.println("Exception");
	}  
}
}