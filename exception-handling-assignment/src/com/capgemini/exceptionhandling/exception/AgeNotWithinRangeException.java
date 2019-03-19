package com.capgemini.exceptionhandling.exception;

public class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String msg) {
		super(msg);
	}
}
