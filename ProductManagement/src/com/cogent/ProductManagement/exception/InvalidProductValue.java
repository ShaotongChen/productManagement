package com.cogent.ProductManagement.exception;

import lombok.ToString;

@ToString
public class InvalidProductValue extends Exception {
	
	public InvalidProductValue(String message) {
		// TODO Auto-generated constructor stub
	super(message);
	}

}
