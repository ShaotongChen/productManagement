package com.cogent.ProductManagement.model;

import java.util.*;

import com.cogent.ProductManagement.exception.InvalidProductPrice;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Product {
public Product(String productId, String productName, float productPrice, long qty, String batchNo) throws InvalidProductPrice {
		super();
		this.productId = productId;
		this.productName = productName;
		setProductPrice(productPrice);
		this.qty = qty;
		this.batchNo = batchNo;
	}
private String productId;
private String productName;
private float productPrice;
private Date productDate;
private Date expiryDate;
private long qty;
private String batchNo;
	/*productID: String 
	ProductName: String
	productPrice : Float
	productDate: date
	qty: long;
	expiryDate: date
	batchNo: String.*/
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getProductPrice() {
	
	return productPrice;
}
public void setProductPrice(float productPrice) throws InvalidProductPrice {
	if(productPrice>=0)
	this.productPrice = productPrice;
	else
		throw new InvalidProductPrice("wrong number");
}
public Date getProductDate() {
	return productDate;
}
public void setProductDate(Date productDate) {
	this.productDate = productDate;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
public long getQty() {
	return qty;
}
public void setQty(long qty) {
	this.qty = qty;
}
public String getBatchNo() {
	return batchNo;
}
public void setBatchNo(String batchNo) {
	this.batchNo = batchNo;
}
}
