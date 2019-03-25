package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;
import com.capgemini.model.Factorial;

public class FactorialTest {

	@Test(expected = InvalidInputException.class)
	public void testInvalidInputException() throws InvalidInputException, FactorialException {
		Factorial fact = new Factorial();
		fact.getFactorial(1);

	}

	@Test(expected = FactorialException.class)
	public void testFactorialException() throws InvalidInputException, FactorialException {
		Factorial fact = new Factorial();
		fact.getFactorial(8);

	}


}