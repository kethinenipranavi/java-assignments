package com.capgemini.bankapp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.exceptions.BankAccountNotFoundException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;

public class BankAccountClient {

	static final Logger logger = Logger.getLogger(BankAccountClient.class);

	public static void main(String[] args) throws BankAccountNotFoundException  {

		int choice;
		long accountId;
		String accountHolderName;
		String accountType;
		double accountBalance;
		double withdrawAmount;
		double depositAmount;
		long fromAccountId;
		long toAccountId;
		BankAccountService bankService = new BankAccountServiceImpl();
		BankAccountDao bankDao = new BankAccountDaoImpl();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {
				System.out.println("1. Add New BankAccount\n2. Withdraw\n3. Deposit\n4. Fund Transfer");
				System.out.println("5. Delete BankAccount\n6. Display All BankAccount Details");
				System.out.println("7. Search BankAccount\n8. Check Balance\n9.Update account Section\n10.Exit\n");

				System.out.print("Please enter your choice  ");
				choice = Integer.parseInt(reader.readLine());

				switch (choice) {

				case 1:
					System.out.println("New BankAccount");
					System.out.println("Enter account holder name: ");
					accountHolderName = reader.readLine();
					System.out.println("Enter account type: ");
					accountType = reader.readLine();
					System.out.println("Enter account balance: ");
					accountBalance = Double.parseDouble(reader.readLine());
					BankAccount account = new BankAccount(accountHolderName, accountType, accountBalance);
					if (bankService.addNewBankAccount(account))
						System.out.println("Account created successfully...\n");
					else
						System.out.println("failed to create new account...\n");
					break;

				case 2:
					System.out.println("Withdraw section");
					System.out.println("Enter account id :");
					accountId = Long.parseLong(reader.readLine());
					System.out.print("Enter amount to withdraw :  ");
					withdrawAmount = Double.parseDouble(reader.readLine());
					try {
						 bankService.withdraw(accountId, withdrawAmount);
						System.out.println(	"Amount withdrawn Successfully:");
					
					} catch (LowBalanceException e) {
						
						logger.error("withDrawFailed:",e);
					}
			break;

				case 3:
					System.out.println(" Deposit Section");
					System.out.println("Enter account id: ");
					accountId = Long.parseLong(reader.readLine());
						System.out.println("Enter amount to Deposit:");
						depositAmount = Double.parseDouble(reader.readLine());

						System.out.println(
								"Balance After deposit : " + bankService.deposit(accountId, depositAmount));
						System.out.println("amount is credited sucessfully...\n");
					break;
				case 4:

					System.out.println("Fund Transfer Section :");
					System.out.println("Enter fromAccount Id: ");
					fromAccountId = Long.parseLong(reader.readLine());
					
							System.out.println("Enter toAccount Id:");
							toAccountId = Long.parseLong(reader.readLine());
								System.out.println("Enter transfer amount : ");
								double amount = Double.parseDouble(reader.readLine());

								try {
									System.out.println(" Senders Available balance after fund transfer : "
											+ bankService.fundTransfer(fromAccountId, toAccountId, amount));
								    System.out.println("amount is debit sucessfully...\n");
								}
								      
				
								catch(LowBalanceException e) {
									System.out.println(e.getMessage());
									}

					break;

				case 5:
					System.out.println("Delete Account Section :");
					System.out.println("Enter Account Id to delete BankAccount: ");
					accountId = Long.parseLong(reader.readLine());

					
							if (bankService.deleteBankAccount(accountId))
								System.out.println("Account DELETED successfully...!!");
							else
								System.out.println("Failed to delete Account..!!");
					

					break;

				case 6:
					System.out.println("Display all Accounts Section :");
					List<BankAccount> list = bankService.findAllBankAccounts();

					for (BankAccount s : list) {
						System.out.println(s);
					}

					break;

				case 7:
					System.out.println("Search Account Details Section :");
					System.out.println("Enter Account Id : ");
					accountId = Long.parseLong(reader.readLine());

					System.out.println("Details of Account" + accountId);
					System.out.println(bankDao.searchAccountDetails(accountId));

					break;


				case 8:
					System.out.println(" Check Balance Section :");
					System.out.println("Enter account id: ");
					accountId = Long.parseLong(reader.readLine());
					
							System.out.println("accountId :" + accountId + " balance :" + bankService.checkBalance(accountId));
						
					
					break;

				case 9:

					System.out.println(" Update BankAccount Section--");
					System.out.println("Enter Account Id to Update BankAccount: ");
					accountId = Integer.parseInt(reader.readLine());
//
//					
//							System.out.println("Enter Account Name to Update: ");
//							String newName = reader.readLine();
//							System.out.println("Enter AccountType to Update: ");
//							String newType = reader.readLine();
//							
//							if (bankService.updateBankAccountDetails(account_id,newName, newType))
//								System.out.println("details updated successfully..!!");
//							else
//								System.out.println("Failed to update details..!!");
//						
					break;

				case 10:
					System.out.println("Thanks for banking with us.");
					System.exit(0);

				}
			}
		}catch(IOException e){

		// e.printStackTrace();
		logger.error(e);
		logger.error("Exception:", e);
	}
	}
}


