package com.capgemini.collection.model;

import java.util.Objects;

public class Television {

	private String company;
	private String type;
	private boolean enabled3d;
	private double price;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String company, String type, boolean enabled3d, double price) {
		super();
		this.company = company;
		this.type = type;
		this.enabled3d = enabled3d;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEnabled3d() {
		return enabled3d;
	}
	public void setEnabled3d(boolean enabled3d) {
		this.enabled3d = enabled3d;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", enabled3d=" + enabled3d + ", price=" + price
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,type,price);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Television))
			return false;
		if(this==obj)
			return true;
		Television television = (Television) obj;
		if(this.company.equals(television.company) && this.type.equals(television.type) && this.price==television.price)
			return true;
		else
			return false;
			
	}
	

}
