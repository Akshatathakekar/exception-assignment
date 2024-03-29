package com.capgemini.model;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;

public class Date {

	private int day;
	private int month;
	private int year;
	private int limit;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void checkDayMonth() throws InvalidDayException, InvalidMonthException {
		if (!(month >= 1 && month <= 12)) {
			throw new InvalidMonthException("Invalid month");
		}

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			if (!((day == 29 && month == 2))) {
				throw new InvalidDayException("Invalid day");
			}
		} else if (month == 2) {
			if (day > 28) {
				throw new InvalidDayException("Invalid day");

			}
		}

		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {

			if (day > 31) {
				throw new InvalidDayException("Invalid day");
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				throw new InvalidDayException("Invalid day");

			}
		}
	}
}
