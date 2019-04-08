package com.capgemini.spring.messagerenderer;

import org.springframework.context.annotation.*;
import com.capgemini.spring.messagerenderer.MessageRenderer;
import com.capgemini.spring.messageprovider.*;

@Configuration
 public class MessageRendererConfig{
	
	@Bean
	public MessageRenderer config(){
		MessageRenderer render =  new MessageRenderer();
		render.setMessageProvider( new GMMessageProvider());
		return render;
	}
}