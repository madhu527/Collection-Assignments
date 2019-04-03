package com.capgemini.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.client.CellPhone;
 

public class CellphoneTest {
	 private CellPhone RedMiNote7;
	 private CellPhone NokiaLumia;
	 private CellPhone iPhone;
	 //company, model, description, operatingSystem, price
	 @Before
	 public void setUp() {
	 RedMiNote7= new CellPhone("Redmi","Note7","128GB 28MP 7Inches","Android",17000);
	 NokiaLumia=new CellPhone("Nokia","Lumia720","32GB 18MP 7Inches","Windows",15000);
	 iPhone=new CellPhone("Apple","iPhone7","32GB 24MP 7Inches","IOS",80000);
	 }
	 @Test
	 public void test() {
	 
	 HashSet<CellPhone> cellPhones = new HashSet<>();
	 cellPhones.add(RedMiNote7);
	 cellPhones.add(NokiaLumia);
	 cellPhones.add(iPhone);
	 cellPhones.add(NokiaLumia);
	 assertEquals(3, cellPhones.size());
	}
	 @Test
	 public void test2() {
		 
	 
	 ArrayList<CellPhone> cellPhones = new ArrayList<>();
	 cellPhones.add(RedMiNote7);
	 cellPhones.add(NokiaLumia);
	 cellPhones.add(iPhone);
	 cellPhones.add(NokiaLumia);
	 cellPhones.add(NokiaLumia);
	 assertEquals(5, cellPhones.size());
	 }
	     
}
