package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/get/{productId}")
	public Product getOne(@PathVariable int productId) {
		Product pd=service.getProduct(productId);
		return pd;
	}
	
	@GetMapping("/getall")
	public List<Product> get() {
		List<Product> pd1=service.getAll();
		return pd1;
	}
	@DeleteMapping("/delete/{productId}")
	public void delete(@PathVariable Integer productId) {
		service.deleteProduct(productId);
	}
	@PutMapping("/edit/{productId}")
	public String update(@RequestBody Product product,@PathVariable Integer productId) {
		String m=null;
		Product p=service.updateProduct(product, productId);
		if(p!=null) {
			m = "Data updated successfully";
		}
		else {
			m="Data Not updated";
		}
		return m;
	}

}
