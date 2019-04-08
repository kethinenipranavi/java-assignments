package com.capgemini.spring.annotation;

import com.capgemini.spring.messagerender.*;
import com.capgemini.spring.messageprovider.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfiguration {

@Lazy	
@Bean
 public MessageProvider provider() {
 	return new HWMessageProvider();
 }

 @Lazy
 @Bean
 public MessageRenderer renderer(){
 	MessageRenderer renderer = new MessageRenderer();
 	renderer.setMessageProvider(provider());
 	return renderer;
 }
}