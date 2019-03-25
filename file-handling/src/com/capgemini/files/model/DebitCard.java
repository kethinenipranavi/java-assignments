package com.capgemini.files.model;

import java.io.Serializable;

public class DebitCard implements Serializable {
	
	private long cardNumber;
	private int cvv;
	private int expiryDate;
	private int expiryYear;
	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DebitCard(long cardNumber, int cvv, int expiryDate, int expiryYear) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
		this.expiryYear = expiryYear;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	

}
