package com.capgemini.spring.test;

import com.capgemini.spring.messageprovider.*;
import com.capgemini.spring.messagerenderer.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import java.util.*;

class Test{

	public static void main(String args[]) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageRendererConfig.class);
		MessageRenderer renderer = (MessageRenderer) context.getBean(MessageRenderer.class);
		System.out.println("WOW");
		renderer.render();

		
	}

}