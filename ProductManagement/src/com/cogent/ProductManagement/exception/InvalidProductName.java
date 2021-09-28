package com.cogent.ProductManagement.exception;

import lombok.ToString;

@ToString
public class InvalidProductName extends Exception {

	 public InvalidProductName(String message) {
		// TODO Auto-generated constructor stub
	super(message);
	 }
}
