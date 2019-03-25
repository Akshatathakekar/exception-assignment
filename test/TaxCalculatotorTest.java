package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.CountryNotValidException;
import com.capgemini.model.EmployeeNameInvalidException;
import com.capgemini.model.TaxCalculator;
import com.capgemini.model.TaxNotEligibleException;

public class TaxCalculatotorTest {
	
	private TaxCalculator tax;
	
	@Before
	public void setUp()
	{
		 tax=new TaxCalculator();
	}

	@Test(expected = EmployeeNameInvalidException.class)
	public void testEmployeeNameInvalidException() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException{
	
        tax.calculateTax(null, true ,30000);
	}
	
	@Test(expected = CountryNotValidException.class)
	public void testCountryNotValidException() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException{
	tax=new TaxCalculator();
    tax.calculateTax("Ron", false,34000.0);
	}

	@Test(expected = TaxNotEligibleException.class)
	public void testTaxNotEligibleException() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException{
	tax=new TaxCalculator();
    tax.calculateTax("Tim", true,1000);
	}
	
	@Test
	public void testTaxAmount() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
	assertEquals(3300.0,tax.calculateTax("Jack" , true, 55000),0.01);
	}
	
}
	

