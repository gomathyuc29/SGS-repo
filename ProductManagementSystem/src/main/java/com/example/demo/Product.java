package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PRODUCT")
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String pid;
	
	@Column(name="product_name")
	private String pname;
	
	@Column(name="manu_details")
	private String manuDetails;
	
	@Column(name="price")
	private double price;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getManuDetails() {
		return manuDetails;
	}

	public void setManuDetails(String manuDetails) {
		this.manuDetails = manuDetails;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
