package com.capgemini.spring.messagerenderer;
import com.capgemini.spring.messageprovider.*;	
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
	
	@Component
	public class MessageRenderer {
	private MessageProvider provider;

	@Autowired
	@Qualifier("GMMessageProvider")
	//@Qualifier("HelloWorldMessageProvider")
	public void setMessageProvider(MessageProvider provider) {
	this.provider = provider;
	}
	
	public void renderer() {
	System.out.println(provider.getMessage());
	}
}