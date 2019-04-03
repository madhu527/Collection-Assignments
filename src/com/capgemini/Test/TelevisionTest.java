package com.capgemini.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.client.Television;

public class TelevisionTest {

	 private Television LG;
	 private Television Sony;
	 private Television Samsung;
	  
	 @Before
	//company, type (LCD, LED, Plasma), 3D enabled, price
	 public void setUp() {
	 LG=new Television("LG","plasma",true,35000);
	 Samsung=new Television("Samsung","LED",false,35000);
	 Sony=new Television("Sony","LCD",true,35000);
	 }
	 @Test
	 public void test() {
		 HashSet<Television> tv=new HashSet<>();
		 tv.add(LG);
		 tv.add(Samsung);
		 tv.add(Sony);
		 assertEquals(3,tv.size());
		 
	 }
	 @Test
	 public void test2() {
		 TreeSet<Television> tv=new TreeSet<>();
		 tv.add(Samsung);
		 tv.add(LG);
		  
		/*
		 * tv.add(Sony); assertEquals("LG",Iterable.next().getcompanyName());
		 * assertEquals("samsung",iterator.next().getcompanyName());
		 * assertEquals("Sony",iterator.next().getcompanyName());
		 */
	 }
	 

}
