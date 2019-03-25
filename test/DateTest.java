package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;
import com.capgemini.model.Date;

public class DateTest {


	@Test(expected = InvalidDayException.class)
	public void testInvalidDayException() throws InvalidDayException, InvalidMonthException {
		 Date d1=new  Date(31,2,1200);
	 d1.checkDayMonth();
	}

	@Test(expected = InvalidDayException.class)
	public void testCheckInvalidDayException() throws InvalidDayException, InvalidMonthException {
		 Date d1=new  Date(32,5,2015);
	 d1.checkDayMonth();
	}
	
	@Test(expected = InvalidMonthException.class)
	public void testInvalidMonthException() throws InvalidDayException, InvalidMonthException {
		 Date d1=new  Date(3,21,2018);
    d1.checkDayMonth();
	}

	@Test(expected = InvalidDayException.class)
	public void testInvalidDayCheckException() throws InvalidDayException, InvalidMonthException {
		 Date d1=new  Date(31,4,1999);
	 d1.checkDayMonth();
	}

	@Test(expected = InvalidDayException.class)
	public void testInvalidDaysecondCheckException() throws InvalidDayException, InvalidMonthException {
		 Date d1=new  Date(31,7,2000);
	 d1.checkDayMonth();
	}
	

	@Test(expected = InvalidDayException.class)
	public void testInvalidDaythirdCheckException() throws InvalidDayException, InvalidMonthException {
		 Date d1=new  Date(31,7,2000);
	 d1.checkDayMonth();
	}
	

	@Test(expected = InvalidDayException.class)
	public void testInvalidDaymonthCheckException() throws InvalidDayException, InvalidMonthException {
		 Date d1=new  Date(28,2,2000);
	 d1.checkDayMonth();
	}
	
	

}
