package com.capgemini.client;

import static org.junit.Assert.*;

import org.junit.Test;

public class Television implements Comparable<Television> {
	//company, type (LCD, LED, Plasma), 3D enabled, price
	private String companyName;
	private String type;
	private boolean enabled3d;
	private double price;
	public Television() {
		 
	}
	public Television(String companyName, String type, boolean enabled3d, double price) {
		super();
		this.companyName = companyName;
		this.type = type;
		this.enabled3d = enabled3d;
		this.price = price;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public int compareTo(Television tv) {
		 
		return this.companyName.compareTo(tv.companyName);
	}
	 
	

}
