package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Product;
import com.rest.service.ProductServiceImp;

@RestController
public class ProductController {
	@Autowired 
	private ProductServiceImp service;
	
	@PostMapping("/save")
	public String save(@RequestBody Product product) {
		String msg=null;
		Product pd=service.save(product);
		if(pd!=null) {
			msg="data is inserted";
		}
		else {
			msg="not inserted";
		}
		return msg;
	}
	@GetMapping("/get/{category}")
	public Product get(@PathVariable String category) {
		Product pd1=service.getProduct(category);
		return pd1;
	}
	@GetMapping("/getall")
	public List<Product> getAllProduct() {
		List<Product> pd1=service.getAll();
		return pd1;
	}
}
