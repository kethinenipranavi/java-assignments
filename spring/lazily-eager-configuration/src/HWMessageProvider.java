package com.capgemini.spring.messageprovider;




public class HWMessageProvider implements MessageProvider{
	@Override
	public String getMessage(){
		return "Hello World!!";
	}
}