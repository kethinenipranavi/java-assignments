package com.capgemini.exceptionhandling.model;


import com.capgemini.exceptionhandling.exception.FactorialException;
import com.capgemini.exceptionhandling.exception.InvalidInputException;

public class Factorial {

	public long getFactorial(int number) throws FactorialException, InvalidInputException {
		// TODO Auto-generated method stub
		long result = 1;
		if (number < 2) {
			throw new InvalidInputException("number not less than two");
		} else {
			for (int i = number; i >= 1; --i) {
				result = result * i;
				if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
					throw new FactorialException("result is greaterthan intiger value");
				}
			}
			System.out.println(result);
			return result;

		}
	}

}
