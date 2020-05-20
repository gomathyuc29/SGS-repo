package com.example.demo;

public class ProductDTO {

	private String pid;
	private String pname;
	private String manuDetails;
	private double price;
	public ProductDTO()
	{
		
	}
	public ProductDTO(String pid, String pname, String manu,double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.manuDetails = manu;
		this.price=price;
	}
	
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
