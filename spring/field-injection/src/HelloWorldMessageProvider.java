package com.capgemini.spring.messageprovider;


public class HelloWorldMessageProvider implements MessageProvider {
	 @Override
	 public String getMessage() {
	 return "Hello World";
	 }
}