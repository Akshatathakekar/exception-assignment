 package com.capgemini.model;

import com.capgemini.exception.DebitLimitExceed;
import com.capgemini.exception.InsufficientFund;

public class SavingAccount extends BankAccount {

	private boolean salaryAccount;
	public static final double MIN_BALANCE=10000.0;
	
	public SavingAccount( int accountId,String accountHolderName, double balance,String accountType,boolean salaryAccount)
	{
		super(accountId,accountHolderName,balance,"SAVING");
		this.salaryAccount=salaryAccount;
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	
	public double withdraw(double amount) throws InsufficientFund, DebitLimitExceed
	{
		if(salaryAccount)
		{
			return super.withdraw(amount);
		}
		else
		{
			if((getBalance()-amount)>=MIN_BALANCE)
			{
				
				setBalance(getBalance()-amount);
			}
			else
			{
				
				throw new InsufficientFund("You have insufficient fund");
			}
			
		}
		
			return getBalance();
		
		
	}
	
	public void displayBankAccountDetails() {
		super.displayBankAccountDetails();
		System.out.println("Salary Account: " + salaryAccount);
	}
	
	
}
