package com.capgemini.exception;

public class DebitLimitExceed extends Exception {

	private String message;
	public DebitLimitExceed(String message) {
		super(message);
	}
}
