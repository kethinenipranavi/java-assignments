package com.capgimini.bankapp.model;

public class BankAccount {

	private long accountId;
	private String accountHolderName;
	private String accounttype;
	private double accountBalance;

	public BankAccount() {
		super();

	}

	public BankAccount(long accountId, String accountHolderName, String accounttype, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accounttype = accounttype;
		this.accountBalance = accountBalance;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double withdraw(double amount) {
		if(accountBalance >=amount)
			accountBalance = accountBalance-amount;
		else
			System.out.println("You don't have sufficient fund");
		return accountBalance;
	}
	public double deposit(double amount) {
		accountBalance=accountBalance+amount;
		return accountBalance;
	}
}
