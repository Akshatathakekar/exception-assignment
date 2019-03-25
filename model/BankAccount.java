package com.capgemini.model;

import com.capgemini.exception.InsufficientFund;

public class BankAccount {

	private String accountHolderName;
	private double balance;
	private int accountId;
	private String accountType;

	public BankAccount() {

	}

	public BankAccount(int accountId, String accountHoldername, double balance, String accountType) {

		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountId = accountId;
		this.accountType = accountType;

	}

	public double withdraw(double amount) throws InsufficientFund, com.capgemini.exception.DebitLimitExceed  {
		if (balance >= amount)
			balance = balance - amount;
		else
			throw new InsufficientFund("Insufficient fund");
		return balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public void displayBankAccountDetails() {
		System.out.println("BankAccount Id: " + accountId);
		System.out.println("BankAccount Holder name: " + accountHolderName);
		System.out.println("BankAccout type: " + accountType);
		System.out.println("BankAccount balance: " + balance);
	}

}
