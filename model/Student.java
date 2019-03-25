package com.capgemini.model;



import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

public class Student {

	private int rollNumber;
	private double age;
	private String name;
	private String course;

	public Student(int rollNumber, double age, String name, String course) throws NameNotValidException {
		super();
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
		this.course = course;
		
		if(!(name.matches("^[a-zA-Z]*$")))
		{	
			throw new NameNotValidException("Invalid name");
		}
	}

	public void checkAgeWithRange() throws AgeNotWithinRangeException {
		if (!(age >= 15 && age <= 21)) {
			throw new AgeNotWithinRangeException("Invalid age");

		}
	}
	

}