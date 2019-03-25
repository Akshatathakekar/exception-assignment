package com.capgemini.test;


import org.junit.Test;

import com.capgemini.exception.DebitLimitExceed;
import com.capgemini.model.CurrentAccount;

public class CurrentAccountTest {
	private CurrentAccount account;


	@Test(expected = DebitLimitExceed.class)
	public void testWithDebitLimitExceed() throws  DebitLimitExceed {
		account = new CurrentAccount(101, "John", 45000, "CURRENT");
		account.withdraw(70000);

	}
	
		
}
