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
	private String category;
	private int productId;
	private String productName;
	private String productType;
	private double price;
	@OneToMany(targetEntity = Discount.class)
	@JoinColumn(name=("cp_fk"), referencedColumnName ="productId")
	private List<Discount> dis;
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
	public List<Discount> getDis() {
		return dis;
	}
	public void setDis(List<Discount> dis) {
		this.dis = dis;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", category=" + category + ", price=" + price + ", dis=" + dis + ", finalPrice=" + finalPrice + "]";
	}
}
	