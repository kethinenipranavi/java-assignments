package com.capgemini.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.bankapp.client.BankAccount;
import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.exception.AccountNotFoundException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.capgemini.bankapp.rowmap.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.dao.EmptyResultDataAccessException;


@Transactional
public class BankAccountDaoImpl implements BankAccountDao {
	
	private JdbcTemplate jdbcTemplate;
	public BankAccountDaoImpl(JdbcTemplate jdbcTemplate){
		 this.jdbcTemplate = jdbcTemplate; 
	}
	//private DataSource dataSource;
	//private Connection connection;
	
 
	/*public BankAccountDaoImpl(DataSource dataSource)
	{
		this.dataSource=dataSource;
	try {
		connection=dataSource.getConnection();
		connection.setAutoCommit(true);
	}
	catch(Exception e) {
	}
	}*/

	@Override
	public double getBalance(long accountId) {
		double balance = jdbcTemplate.queryForObject("SELECT account_balance FROM bankaccounts WHERE account_id=?",
				new Object[] { accountId }, Double.class);
		return balance;
	}
	@Override
	public void updateBalance(long accountId, double newBalance) {
		jdbcTemplate.update("UPDATE bankaccounts SET account_balance=? WHERE account_id=?",
				new Object[] {newBalance,accountId });
	
	}


	@Override
	public boolean deleteBankAccount(long accountId) {
		int result=jdbcTemplate.update("DELETE FROM bankaccounts WHERE account_id=?", new Object[] {accountId});
			if (result == 1) {
				return true;
			}
		return false;
	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {

		int result = jdbcTemplate.update("INSERT INTO bankaccounts(customer_name,account_type,account_balance) VALUES(?,?,?)", new Object[] {account.getAccountHolderName(), account.getAccountType(), account.getAccountBalance() });

			if (result == 1) {
				return true;
			}
		
		return false;
	}

	@Override
	public List<BankAccount> findAllBankAccountsDetails() {
		List <BankAccount> account = jdbcTemplate.query("SELECT *FROM bankaccounts",new Object[] {},new BankAccountMapper());
			return account;
	}

	@Override
	public BankAccount searchAccountDetails(long accountId) throws AccountNotFoundException {
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
			AccountNotFoundException  re= new AccountNotFoundException("Bank Account not Found");
			ex.initCause(re);
			throw re;

		}
	
		return account;
}

		
	@Override
	public boolean updateBankAccountDetails(long accountId, String accountHolderName, String accountType) {

		int result=jdbcTemplate.update("UPDATE bankaccounts SET customer_name='"+accountHolderName+"',account_type='"+accountType+"' WHERE account_id='"+accountId+"' ");

			if (result == 1) {
				return true;
			}

		return false;
	}
	
}
