package com.capgemini.test;


import org.junit.Test;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;
import com.capgemini.model.Student;

public class StudentTest {


	@Test(expected = AgeNotWithinRangeException.class)
	public void testAgeNotWithinRangeException() throws AgeNotWithinRangeException, NameNotValidException  
	{
		Student  student = new Student(11,14,"John","Computer");
		student.checkAgeWithRange();

	}


	@Test(expected = NameNotValidException.class)
	public void testNameNotValidException() throws AgeNotWithinRangeException, NameNotValidException
	{
		Student  student = new Student(11,14,"Jo@hn","Computer");
		
	}

}
