package com.cogent.ProductManagement;

import com.cogent.ProductManagement.Service.ProductService;
import com.cogent.ProductManagement.Service.ProductServiceImpl;
import com.cogent.ProductManagement.exception.InvalidProductId;
import com.cogent.ProductManagement.exception.InvalidProductPrice;
import com.cogent.ProductManagement.model.Product;

public class Main {
public static void main(String[] args) {
	
	ProductService productService= ProductServiceImpl.getInstance();
	 Product product = null,product1 = null,product2 = null,product3 = null,product4 = null,
	 product5 = null,product6 = null,product7 = null,product8 = null,product9 = null, productT=null;
	try {
		product = new Product("0001","duck",100.0f, 10, "1233");
		 product1= new Product("0002","duc",101.0f, 11, "233");
		 product2= new Product("0003","du",1.0f, 12, "33");
		 product3= new Product("0004","d",111.0f, 13, "133");
		 product4= new Product("0005","uck",123.0f, 14, "123");
		 product5= new Product("0006","ck",1234.0f, 15, "123113");
		 product6= new Product("0007","k",12221.0f, 16, "123223");
		 product7= new Product("0008","dk",400.0f, 17, "123443");
		 product8= new Product("0009","dck",500.0f, 18, "123553");
		 product9= new Product("0010","duk",600.0f, 19, "123663");
		 
	} catch (InvalidProductPrice e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	 productService.addProduct(product);
	 productService.addProduct(product1);
	 productService.addProduct(product2);
	 productService.addProduct(product3);
	 productService.addProduct(product4);
	 productService.addProduct(product5);
	 productService.addProduct(product7);
	 productService.addProduct(product6);
	 productService.addProduct(product8);
	 productService.addProduct(product9);
	 
	/* try {
		productT= new Product(".....",".....",00.0f, 00, "......");
		 productService.deleteProductById("0002");
		// productService.deleteAllProducts();
		//System.out.println( productService.getProductByID("0003"));
		System.out.println( productService.upddateProduct("0007", productT));
	} catch (InvalidProductPrice e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidProductId e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 Product[] products = productService.getProducts();
	 for(Product prod: products) {
		 System.out.println(prod);
	 }
			*/
}
}
