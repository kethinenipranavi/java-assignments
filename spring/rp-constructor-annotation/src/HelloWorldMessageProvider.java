package com.capgemini.spring.messageprovider;
import org.springframework.stereotype.*;


public class HelloWorldMessageProvider implements MessageProvider {
	 @Override
	 public String getMessage() {
	 return "Hello World";
	 }
}