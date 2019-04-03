package com.capgemini.client;

import static org.junit.Assert.*;

import org.junit.Test;

public class car implements Comparable<car>  {

	// make, model, year, price
 
   private static String model;
   private double year;
   private double price;
public car() {
	 
}
public car(String make, String model, double year, double price) {
	super();
	this.model = make;
	this.model = model;
	this.year = year;
	this.price = price;
}
public String getMake() {
	return model;
}
public void setMake(String make) {
	this.model = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getYear() {
	return year;
}
public void setYear(double year) {
	this.year = year;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(year);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	car other = (car) obj;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (Double.doubleToLongBits(year) != Double.doubleToLongBits(other.year))
		return false;
	return true;
}
 @Override
  public int compareTo(car cars) {	 
	return model.compareTo(car.model);
}
   
   
}
