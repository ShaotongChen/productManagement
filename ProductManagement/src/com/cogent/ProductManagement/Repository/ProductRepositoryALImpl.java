package com.cogent.ProductManagement.Repository;

import java.util.ArrayList;

import com.cogent.ProductManagement.exception.InvalidProductId;
import com.cogent.ProductManagement.model.Product;

public class ProductRepositoryALImpl implements ProductRepository {

	private static ProductRepository productRepository;
	private ProductRepositoryALImpl() {
		
	}
	public static ProductRepository getInstance() {
		if(productRepository==null) {
		productRepository= new ProductRepositoryALImpl();
			return productRepository;}
		return productRepository;
	}
	ArrayList<Product> products= new ArrayList<>();
	@Override
	public String addProduct(Product product) {
		if(product!=null)
		{	products.add(product);
		System.out.println(products.size());
		return "success";
	}else
		return "fail";
	}

	@Override
	public String deleteProductById(String id) throws InvalidProductId {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProductByID(String id) throws InvalidProductId {

		for (Product product : products) {
			if(product!=null && id.equals(product.getProductId()))
				return product;
		}
		return null;
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upddateProduct(String id, Product employee) throws InvalidProductId {
		// TODO Auto-generated method stub
		return null;
	}

}
