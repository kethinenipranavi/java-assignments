package com.capgemini.bankapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.bankapp.exception.BankAccountNotFoundException;
import com.capgemini.bankapp.model.BankAccount;

@Repository
public class BankAccountDaoImpl implements BankAccountDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public boolean addNewBankAccount(BankAccount account) {

		int result = jdbcTemplate.update("INSERT INTO bankaccounts(customer_name,account_type,account_balance) VALUES(?,?,?)", new Object[] {account.getAccountHolderName(), account.getAccountType(), account.getAccountBalance() });

			if (result == 1){
				return true;
			}
			return false;
	}

	public boolean updateAccountDetails(long accountId, String accountHolderName, String accountType) {

		int result=jdbcTemplate.update("UPDATE bankaccounts SET customer_name='"+accountHolderName+"',account_type='"+accountType+"' WHERE account_id='"+accountId+"' ");
		if(result==1){
				return true;
		}
		return false;
	}

	public boolean deleteBankAccount(long accountId) {
		int result=jdbcTemplate.update("DELETE FROM bankaccounts WHERE account_id=?", new Object[] {accountId});
			if (result == 1)
				return true;
 
		return false;
	}

	public List<BankAccount> findAllBankAccounts() {
		List <BankAccount> account = jdbcTemplate.query("SELECT *FROM bankaccounts",(rs,rowNum)->{
			long id= rs.getLong(1);
			String name=rs.getString(2);
			String type= rs.getString(3);
			double balance= rs.getDouble(4);
			BankAccount bankAccount= new BankAccount(id,name,type,balance);
			return bankAccount;
		});
		
		return account;
	}

	public BankAccount searchAccount(long accountId) throws BankAccountNotFoundException  {
		BankAccount account=null;
		try{
			String query = "SELECT * FROM bankaccounts WHERE account_id="+accountId ;
			 account=jdbcTemplate.queryForObject(query,(rs,rowNum)->{
				long id= rs.getLong(1);
				String name=rs.getString(2);
				String type= rs.getString(3);
				double balance= rs.getDouble(4);
				BankAccount bankAccount= new BankAccount(id, name, type, balance);
				return bankAccount;
			});
		}
		catch(EmptyResultDataAccessException ex){
			BankAccountNotFoundException  re= new BankAccountNotFoundException("Bank Account not Found");
			ex.initCause(re);
			throw re;

		}
	
		return account;
	}


	public double getBalance(long accountId) throws BankAccountNotFoundException {
		double balance = jdbcTemplate.queryForObject("SELECT account_balance FROM bankaccounts WHERE account_id=?",
				new Object[] { accountId }, Double.class);
		return balance;
	}


	public void updateBalance(long accountId, double newBalance) throws BankAccountNotFoundException {
		jdbcTemplate.update("UPDATE bankaccounts SET account_balance=? WHERE account_id=?",
				new Object[] {newBalance,accountId });
	
		
	

	}


}
