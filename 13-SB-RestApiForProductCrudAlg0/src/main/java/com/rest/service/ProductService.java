package com.rest.service;

import java.util.List;

import com.rest.entity.Charges;
import com.rest.entity.Product;

public interface ProductService {
	public Product save(Product product);
	public Product updateProduct(Product product, Integer productId);
	public void deleteProduct(Integer productId);
	public Product getProduct(Integer productId);
	public List<Product> getAll();
	
	public Charges save(Charges charg);
}
