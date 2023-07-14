package com.rest.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="prod")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int productId;
	private String productName;
	private String productType;
	private String category;
	private double price;
	
	@OneToMany(targetEntity = Charges.class)
	@JoinColumn(name=("cp_fk"), referencedColumnName ="category")
	private List<Charges> charges;
	private double finalPrice;
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public List<Charges> getCharges() {
		return charges;
	}
	public void setCharges(List<Charges> charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", category=" + category + ", price=" + price + ", charges=" + charges + ", finalPrice=" + finalPrice
				+ "]";
	}
	
	
	
}
