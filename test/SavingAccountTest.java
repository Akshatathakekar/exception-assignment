package com.capgemini.test;


import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.DebitLimitExceed;
import com.capgemini.exception.InsufficientFund;
import com.capgemini.model.SavingAccount;


public class SavingAccountTest {
	
	@Test(expected = InsufficientFund.class)
	public void testWithInsufficientFund() throws InsufficientFund, DebitLimitExceed  {
		SavingAccount saving=new SavingAccount(101, "John", 45000, "SAVING", true);	
		saving.withdraw(60000);

	}
	
	@Test(expected = InsufficientFund.class)
	public void testWithoutSalaryAccountInsufficientFund() throws InsufficientFund, DebitLimitExceed {
		SavingAccount saving=new SavingAccount(101, "John", 45000, "SAVING", false);	
		saving.withdraw(60000);

	}

}
