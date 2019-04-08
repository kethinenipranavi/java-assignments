package com.capgemini.spring.messagerender;
import com.capgemini.spring.messageprovider.*;



public class MessageRenderer{
	private MessageProvider provider;

 	public void setMessageProvider(MessageProvider provider) {
		 System.out.println("beans are not created");
		 this.provider = provider;
	}

	public void render(){
		System.out.println(provider.getMessage());	
	}
}