package com.cogent.ProductManagement.Service;

import com.cogent.ProductManagement.Repository.ProductRepository;
import com.cogent.ProductManagement.Repository.ProductRepositoryALImpl;
import com.cogent.ProductManagement.Repository.ProductRepositoryImpl;
import com.cogent.ProductManagement.exception.InvalidProductId;
import com.cogent.ProductManagement.model.Product;

public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository= ProductRepositoryALImpl.getInstance();
	private static ProductService productService;
	private ProductServiceImpl() {}
	public static ProductService getInstance() {
		if(productService==null) {
			productService=new ProductServiceImpl();
			return productService;
		}
		return productService;
		
	}
	
	@Override
	public String addProduct(Product product) {
		
		return productRepository.addProduct(product);
	}

	@Override
	public String deleteProductById(String id) throws InvalidProductId {
			return productRepository.deleteProductById(id);
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
productRepository.deleteAllProducts();		
	}

	@Override
	public Product getProductByID(String id) throws InvalidProductId {
		// TODO Auto-generated method stub
		return productRepository.getProductByID(id);
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}

	@Override
	public String upddateProduct(String id, Product employee) throws InvalidProductId {
		// TODO Auto-generated method stub
		return productRepository.upddateProduct(id, employee);
	}

}
