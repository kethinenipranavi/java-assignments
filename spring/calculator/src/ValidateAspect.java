package com.capgemini.spring.aspect;

import com.capgemini.spring.math.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.AfterReturning;


@Component
@Aspect
public class ValidateAspect{

	/*@Before("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.addition(..))")
	public void add(){
		System.out.println("In Aspect");
	}
	@After("execution (* com.capgemini.spring.calculator.impl.CalculatorImpl.division(..))")
	public void divide(){
		System.out.println("In division Aspect");
	}
	@AfterReturning(pointcut = "execution(* com.capgemini.spring.calculator.impl.CalculatorImpl.addition(..))",returning = "result")

              public void afterResult(int result)throws Throwable

        {

              System.out.println("result");

        } 

        @AfterReturning(pointcut = "execution(* com.capgemini.spring.calculator.impl.CalculatorImpl.division(..))" ,returning = "result")

		public void afterResult(double result)throws Throwable

	{

		System.out.println("result");

	}*/
	 @AfterThrowing(pointcut = "execution(* com.capgemini.spring.calculator.impl.CalculatorImpl.addition(..))",throwing= "error")
		  public void afterResult(ArithmeticException error)throws Throwable
	{
		  System.out.println("result");
	}	
}