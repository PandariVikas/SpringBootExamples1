package com.rest.entity;




import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public  class Discount{
	@Id
	private String category;
	private double discount;
	private double gst;
	private double deliveryCharges;
	public Discount() {
		super();
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getGst() {
		return gst;
	}
	public void setGst(Double gst) {
		this.gst = gst;
	}
	public double getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	@Override
	public String toString() {
		return "Discount [category=" + category + ", discount=" + discount + ", gst=" + gst + ", deliveryCharges="
				+ deliveryCharges + "]";
	}
	
}
