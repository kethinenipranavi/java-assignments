package com.capgemini.bankapp.dao;

public interface BankAccountDao {
	
	public double getBalance(long accountId);
	public void updateBalance(long accountId,double newBalance);
	public boolean deleteBankAccount(long accountId);
	

}
