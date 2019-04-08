package com.capgemini.bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.exceptions.BankAccountNotFoundException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;

@WebServlet(urlPatterns = { "*.do" }, loadOnStartup = 1)
public class BankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BankAccountService bankService;

	public BankAccountController() {
		bankService = new BankAccountServiceImpl();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String path = request.getServletPath();

		if (path.equals("/all account details.do")) {

			List<BankAccount> bankAccounts = bankService.findAllBankAccounts();
			RequestDispatcher dispatcher = request.getRequestDispatcher("all account details.jsp");
			request.setAttribute("accounts", bankAccounts);
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String path = request.getServletPath();
		System.out.println(path);

		if (path.equals("/addNewBankAccount.do")) {
			String customerName = request.getParameter("Customer Name");
			String accountType = request.getParameter("type");
			double accountbalance = Double.parseDouble(request.getParameter("Account Balance"));

			BankAccount account = new BankAccount(customerName, accountType, accountbalance);
			if (bankService.addNewBankAccount(account)) {
				out.println("<h2>BankAccount is created successfully..</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");
				out.close();
			}
		}
		if (path.equals("/Withdraw.do")) {
			long accountId = Long.parseLong(request.getParameter("Account Id"));
			double amount = Double.parseDouble(request.getParameter("Amount"));

			try {
				bankService.withdraw(accountId, amount);
				out.println("<h2>Withdrawn successfully..</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");
				out.close();
			} catch (LowBalanceException | BankAccountNotFoundException e) {

				e.printStackTrace();
				out.println("<h2><a href='index.html'>|Home|</h2>");

			}

		}

		if (path.equals("/FundTransfer.do")) {
			long senderAccountId = Long.parseLong(request.getParameter("senderId"));

			double amount = Double.parseDouble(request.getParameter("Amount"));

			long receiverId = Long.parseLong(request.getParameter("receiverId"));

			try {
				bankService.fundTransfer(senderAccountId, receiverId, amount);
				out.println("<h2>Transfer amount successfully..</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");
				out.close();
			} catch (LowBalanceException | BankAccountNotFoundException e) {

				e.printStackTrace();
				out.println("<h2><a href='index.html'>|Home|</h2>");

			}

		}

		if (path.equals("/Deposit.do")) {
			long accountId = Long.parseLong(request.getParameter("Account Id"));
			double amount = Double.parseDouble(request.getParameter("Amount"));

			try {
				bankService.deposit(accountId, amount);
				out.println("<h2>Deposit successfully..");
				out.println("<h2><a href='index.html'>|Home|</h2>");
				out.close();

			} catch (BankAccountNotFoundException e) {
				out.println("<h2>BankAccountNotFoundExceptionException</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");

			}
		}

		if (path.equals("/DeleteAccount.do")) {
			long accountId = Long.parseLong(request.getParameter("Account Id"));

			try {
				bankService.deleteBankAccount(accountId);
				out.println("<h2>Account deleted successfully..");
				out.println("<h2><a href='index.html'>|Home|</h2>");
				out.close();

			} catch (BankAccountNotFoundException e) {
				out.println("<h2>BankAccountNotFoundExceptionException</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");

			}
		}

		if (path.equals("/CheckBalance.do")) {
			long accountId = Long.parseLong(request.getParameter("Account Id"));

			try {
				bankService.checkBalance(accountId);
				out.println("<h2>Amount Cheked successfully..</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");
				out.close();

			} catch (BankAccountNotFoundException e) {
				out.println("<h2>BankAccountNotFoundExceptionException</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");

			}
		}
		if (path.equals("/search account.do")) {
			long accountId = Long.parseLong(request.getParameter("Account Id"));
			try {
				BankAccount bankaccount = bankService.searchAccountDetails(accountId);
				RequestDispatcher dispatcher = request.getRequestDispatcher("search account.jsp");
				request.setAttribute("accounts", bankaccount);
				dispatcher.forward(request, response);

			} catch (BankAccountNotFoundException e) {
				out.println("<h2>BankAccountNotFoundExceptionException</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");
			}

			out.close();
		}
		if (path.equals("/update account.do")) {
			long accountId = Long.parseLong(request.getParameter("Account Id"));
			try {

				BankAccount bankaccount = bankService.searchAccountDetails(accountId);
				RequestDispatcher dispatcher = request.getRequestDispatcher("update bankaccount.jsp");
				request.setAttribute("accounts", bankaccount);
				dispatcher.forward(request, response);

			} catch (BankAccountNotFoundException e) {
				out.println("<h2>BankAccountNotFoundExceptionException</h2>");
				out.println("<h2><a href='index.html'>|Home|</h2>");
				
				
			}
			out.close();
			
		}

		if (path.equals("/updateAccountDetails.do")) {
			long accountId = Long.parseLong(request.getParameter("Account Id"));
			String customerName = request.getParameter("Customer Name");
			String accountType = request.getParameter("type");

			if (bankService.updateBankAccountDetails(accountId, customerName, accountType)) {
				
			out.println("<h2>Account details updated successfully</h2>");

			out.close();
		}

	}

}
}
