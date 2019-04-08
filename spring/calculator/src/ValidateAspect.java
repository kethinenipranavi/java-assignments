package com.capgemini.spring.aspect;

import com.capgemini.spring.math.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class ValidateAspect{

	@Before("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.addition(..))")
	public void add(){
		System.out.println("In Aspect");
	}
	@After("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.division(..))")
	public void divide(){
		System.out.println("In division Aspect");
	}
	
	
}