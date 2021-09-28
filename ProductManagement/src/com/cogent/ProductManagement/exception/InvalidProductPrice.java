package com.cogent.ProductManagement.exception;

import lombok.ToString;

@ToString
public class InvalidProductPrice extends Exception {

	public InvalidProductPrice(String message) {
		// TODO Auto-generated constructor stub
	super(message);
	}
}
