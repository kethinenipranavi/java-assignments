package com.capgemini.spring.calculator.impl;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.*;

@Component
public class CalculatorImpl implements Calculator{
	public void add(Integer num1,Integer num2) {
		System.out.println(num1+num2);
	}
	public void division(Double num1,Double num2) {
		System.out.println(num1/num2);
	}
}