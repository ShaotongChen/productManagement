package com.cogent.ProductManagement.Repository;

import com.cogent.ProductManagement.exception.InvalidProductId;
import com.cogent.ProductManagement.model.Product;

public interface ProductRepository {

	
	public String addProduct(Product product);
	public String deleteProductById(String id) throws InvalidProductId;
	public void deleteAllProducts();
	public Product getProductByID(String id) throws InvalidProductId;
	public Product[] getProducts();
	public String upddateProduct(String id, Product employee) throws InvalidProductId;
}
