package com.capgemini.spring.messagerenderer;
import com.capgemini.spring.messageprovider.*;	


	public class MessageRenderer {
	private MessageProvider provider;

	public MessageRenderer  (MessageProvider provider) {
	this.provider = provider;
	}
	
	public void renderer() {
	System.out.println(provider.getMessage());
	}
}
