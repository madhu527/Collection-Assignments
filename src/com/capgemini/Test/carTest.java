package com.capgemini.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import com.capgemini.client.Laptop;
import com.capgemini.client.car;

public class carTest {

	private car Honda;
	private car BMW;
	private car maruthi;

	@Before
	public void setUp() {
		Honda = new car("Honda", "hondacity", 2016, 250000);
		BMW = new car("BMW", "j520", 2017, 300000);
		maruthi = new car("maruthi", "hondacity", 2019, 900000);
	}

	@Test
	public void test() {
		HashSet<car> cars = new HashSet<>();
		cars.add(Honda);
		cars.add(BMW);
		cars.add(maruthi);
		assertEquals(3, cars.size());
	}
	
	/*  @Test public void test2() { Iterator<car>it=.iterator();
	  assertEquals(Honda,it.next()); assertEquals(BMW,it.next());
	  assertEquals(maruthi,it.next()); ArrayList<car> cars=new ArrayList<>();
	  cars.add(Honda); cars.add(BMW); cars.add(maruthi); cars.add(Honda);
	  assertEquals(3,cars.size());*/
	  
	  
	 

}
