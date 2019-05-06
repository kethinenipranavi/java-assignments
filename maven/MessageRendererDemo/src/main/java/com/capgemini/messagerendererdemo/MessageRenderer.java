package com.capgemini.spring.messagerenderer;
import com.capgemini.spring.messageprovider.*;	


	public class MessageRenderer {
	private MessageProvider provider;

	public void setMessageProvider(MessageProvider provider) {
	this.provider = provider;
	}
	
	public void renderer() {
	System.out.println(provider.getMessage());
	}
}
