package com.capgemini.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.client.Laptop;

public class LaptopTest {
	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	private static Laptop asusLaptop;
	
	@Before
	public void Setup() {
		dellLaptop=new Laptop("Dell","model544","widows 10","i5");
		hpLaptop=new Laptop("HP","model541","widows 7","i3");
		asusLaptop=new Laptop("Asus","model577","widows 10","i7");
	}
	
	@Test
	public void Test() {
		 ArrayList<Laptop>laptops=new ArrayList<>();
	    laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(asusLaptop);
 
	 
		/* Iterator<Laptop>it=laptops.iterator();
		assertEquals(dellLaptop,it.next());
		 assertEquals(hpLaptop,it.next());
		 assertEquals(asusLaptop,it.next());*/
 
	}
	@Test
	public void Test2() {
		HashSet<Laptop>laptops=new HashSet<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(asusLaptop);
		 assertEquals(3,laptops.size());
		 
	}
	@AfterClass
	public static void tearDown() {
		dellLaptop=null;
		hpLaptop=null;
		asusLaptop=null;
	}
	}
	
	

	


