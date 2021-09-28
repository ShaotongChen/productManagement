package com.cogent.employeemanagementsystem.exception;

import lombok.ToString;

@ToString
public class InvalidSalaryExcception extends Exception {

	
	public InvalidSalaryExcception(String message) {
	super(message);
	}
}
