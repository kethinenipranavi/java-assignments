package com.capgemini.spring.messageprovider;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Lazy
@Component("hm")
public class HelloWorldMessageProvider implements MessageProvider{
	@Override
	public String getMessage(){
		return "Hello World!!";
	}
}