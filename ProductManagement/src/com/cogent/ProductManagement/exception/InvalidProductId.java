package com.cogent.ProductManagement.exception;

import lombok.ToString;

@ToString
public class InvalidProductId extends Exception {

	
	public InvalidProductId(String message) {
		// TODO Auto-generated constructor stub
	super(message);
	}
}
