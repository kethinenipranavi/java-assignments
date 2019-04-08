package com.capgemini.spring.messagerenderer;
import com.capgemini.spring.messageprovider.*;	
import org.springframework.beans.factory.annotation.*;

	
	public class MessageRenderer {

	@Autowired
	private MessageProvider provider;

	public void renderer() {
	System.out.println(provider.getMessage());
	}
}