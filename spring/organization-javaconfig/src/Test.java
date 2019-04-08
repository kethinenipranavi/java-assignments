package com.capgemini.spring.test;
import com.capgemini.spring.model.*;
import com.capgemini.spring.configuration.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.*;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(OrganizationConfig.class);
		Organization organization = (Organization) context.getBean(Organization.class);
		System.out.println("Welcome");
		System.out.println("Organization Details are:" + organization.toString());
		
	}
}