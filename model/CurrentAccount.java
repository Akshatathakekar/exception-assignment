package com.capgemini.model;

import com.capgemini.exception.DebitLimitExceed;

public class CurrentAccount extends BankAccount{
	

	private double debitLimit=20000;
	private double borrowedAmount;

	
	public CurrentAccount()
	{
		
	}
	
	public CurrentAccount(int accountId, String accountHoldername, double balance, String accountType)
	{
		super(accountId,accountHoldername,balance,"CURRENT");

	}
	
	@Override
	public double withdraw(double amount) throws DebitLimitExceed {
		double temp = getBalance() - amount;
		if(temp >= 0)
			setBalance(temp);
		else if(Math.abs(temp) <= (debitLimit - borrowedAmount)) {
			setBalance(0);
			borrowedAmount = borrowedAmount + Math.abs(temp);
		}
		else
		{
			System.out.println("Debit Limit exceeded.");
			throw new DebitLimitExceed("Debit limit exceeded");
		}
			
		
		return getBalance();
	}
	
	@Override
	public double deposit(double amount) {
		if(borrowedAmount == 0)
			return super.deposit(amount);
		else if(amount >= borrowedAmount) {
			setBalance(amount - borrowedAmount);
			borrowedAmount = 0;			
		}
		else {
			borrowedAmount = borrowedAmount - amount;
		}
		return getBalance();
	}
	
	@Override
	public void displayBankAccountDetails() {
		super.displayBankAccountDetails();
		System.out.println("Debit Limit: " + debitLimit);
		System.out.println("Borrowed amount : " + borrowedAmount);
	}

}
