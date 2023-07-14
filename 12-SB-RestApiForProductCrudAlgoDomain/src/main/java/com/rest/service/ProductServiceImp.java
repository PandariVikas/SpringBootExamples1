package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Discount;
import com.rest.entity.Product;
import com.rest.repo.DiscountRepo;
import com.rest.repo.ProductRepo;
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductRepo repo;
	
	@Autowired
	private DiscountRepo repo1;
	@Override
	public Product save(Product product) {
		double d=0.0;
		double gst=0.0;
		double chrg=0.0;
		double fprice=0.0;
		if(product.getCategory().equalsIgnoreCase("electronics")) {
			d=product.getPrice()*15/100;
			gst=product.getPrice()*18/100;
			chrg=350;
		}
		else if(product.getCategory().equalsIgnoreCase("home Appliances")) {
			d=product.getPrice()*22/100;
			gst=product.getPrice()*24/100;
			chrg=800;
		}
		else if(product.getCategory().equalsIgnoreCase("clothing")) {
			d=product.getPrice()*40/100;
			gst=product.getPrice()*12/100;
			chrg=0;
		}
		else if(product.getCategory().equalsIgnoreCase("Furniture")) {
			d=product.getPrice()*10/100;
			gst=product.getPrice()*18/100;
			chrg=300;
		}
		fprice=product.getPrice()+gst+chrg-d;
		Discount dis= new Discount();
		dis.setDeliveryCharges(chrg);
		dis.setDiscount(d);
		dis.setGst(gst);
		dis.setCategory(product.getCategory());
		product.setFinalPrice(fprice);
		repo.save(product);
		repo1.save(dis);
		return product;
	}
	@Override
	public Product getProduct(String category) {
		Product prod=repo.findById(category).get();
		return prod;
	}


	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(String category) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public List<Product> getAll() {
		List<Product> list=repo.findAll();
		return list;
	}

	
}
