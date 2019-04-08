package com.capgemini.bankapp.exceptions;

public class BankAccountNotFoundException extends Exception {
	
	public BankAccountNotFoundException() {
	}
	public BankAccountNotFoundException(String message) {
		super(message);
	}

}
