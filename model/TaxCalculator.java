package com.capgemini.model;

public class TaxCalculator {

	
	private String employeeName;
	private boolean isIndian;
	private double salary;
	private double taxAmount;
	
	public TaxCalculator() {
		super();

	}

	public double  calculateTax(String employeeName, boolean isIndian,double salary) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		
		if(employeeName==null)
		{
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		
		if(!isIndian)
		{
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		else
		{
			if(salary>100000)
			{
				taxAmount=salary *8/100;
			}
			else if(salary>=50000 && salary<=100000)
			{
				taxAmount=salary *6/100;

			}
			else if(salary>=30000 && salary<=50000)
			{
				taxAmount=salary *5/100;

			}
			else if(salary>=10000 && salary<=30000)
			{
				taxAmount=salary *4/100;

			}
			else
			{
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
			return taxAmount;
		}
	}
	
}
