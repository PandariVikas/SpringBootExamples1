package com.rest.service;

import java.util.List;
import com.rest.entity.Product;

public interface ProductService {
	public Product save(Product product);
	public Product updateProduct(Product product);
	public void deleteProduct(String category);
	public Product getProduct(String category);
	public List<Product> getAll();
}
