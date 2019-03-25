package com.capgemini.model;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

public class Factorial {

	int fact = 1;

	public int getFactorial(int number) throws InvalidInputException ,FactorialException
	{
		if(number<2)
		{
			throw new  InvalidInputException("Invalid Number");
		}
		else 
		{	
			for(int i=1;i<=number;i++)
			{
				fact=fact*i;
			}
			if(fact > Integer.MAX_VALUE )
			{
				throw new FactorialException("Value exceeds");
			}
			return fact;	
		}
		

	}
	
	
}
