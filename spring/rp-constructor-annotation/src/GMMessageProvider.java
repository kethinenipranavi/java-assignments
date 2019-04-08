package com.capgemini.spring.messageprovider;
import org.springframework.stereotype.*;

	@Component
	public class GMMessageProvider implements MessageProvider {
	@Override
	 public String getMessage() {
	 return "Good Morning";
	 }
}