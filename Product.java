package com.bean;


	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Product {
	@Id
	private int Id;
	private String pname;
	private float price;
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", pname=" + pname + ", price=" + price + "]";
	}

	}



