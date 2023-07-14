package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Charges;
import com.rest.entity.Product;
import com.rest.repo.ChargesRepo;
import com.rest.repo.ProductRepo;
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductRepo repo;
	
	@Autowired
	private ChargesRepo repo1;
	
	@Override
	public Product save(Product product) {
		
		double dis=0.0;
		double gst=0.0;
		double chrg=0.0;
		double fprice=0.0;
		if(product.getCategory().equalsIgnoreCase("electronics")) {
			dis=product.getPrice()*15/100;
			gst=product.getPrice()*18/100;
			chrg=350;
		}
		else if(product.getCategory().equalsIgnoreCase("home Appliances")) {
			dis=product.getPrice()*22/100;
			gst=product.getPrice()*24/100;
			chrg=800;
		}
		else if(product.getCategory().equalsIgnoreCase("clothing")) {
			dis=product.getPrice()*40/100;
			gst=product.getPrice()*12/100;
			chrg=0;
		}
		else if(product.getCategory().equalsIgnoreCase("Furniture")) {
			dis=product.getPrice()*10/100;
			gst=product.getPrice()*18/100;
			chrg=300;
		}
		Charges c1=new Charges();
		c1.setCategory(product.getCategory());
		c1.setDeliveryCharges(chrg);
		c1.setDiscount(dis);
		c1.setGst(gst);
		repo1.save(c1);
		fprice=product.getPrice()+gst+chrg-dis;
		product.setFinalPrice(fprice);
		repo.save(product);
		return product;
	}
	@Override
	public Charges save(Charges charg) { 
		Charges c1=repo1.save(charg);
		
		return c1;
		
	}
	@Override
	public Product getProduct(Integer productId) {
		Product prod=repo.findById(productId).get();
		
		return prod;
	}


	@Override
	public Product updateProduct(Product product, Integer productId) {
		Product pd=repo.findById(productId).get();
		double dis=0.0;
		double gst=0.0;
		double chrg=0.0;
		double fprice=0.0;
		if(product.getCategory().equalsIgnoreCase("electronics")) {
			dis=product.getPrice()*15/100;
			gst=product.getPrice()*18/100;
			chrg=350;
		}
		else if(product.getCategory().equalsIgnoreCase("home Appliances")) {
			dis=product.getPrice()*22/100;
			gst=product.getPrice()*24/100;
			chrg=800;
		}
		else if(product.getCategory().equalsIgnoreCase("clothing")) {
			dis=product.getPrice()*40/100;
			gst=product.getPrice()*12/100;
			chrg=0;
		}
		else if(product.getCategory().equalsIgnoreCase("Furniture")) {
			dis=product.getPrice()*10/100;
			gst=product.getPrice()*18/100;
			chrg=300;
		}
		Charges c1=new Charges();
		c1.setCategory(product.getCategory());
		c1.setDeliveryCharges(chrg);
		c1.setDiscount(dis);
		c1.setGst(gst);
		repo1.save(c1);
		fprice=product.getPrice()+gst+chrg-dis;
		pd.setFinalPrice(fprice);
		repo.save(pd);
		return pd;
	}

	@Override
	public void deleteProduct(Integer productId) {
		repo.deleteById(productId);
	}

	

	@Override
	public List<Product> getAll() {
		List<Product> list=repo.findAll();
		return list;
	}

	
}
