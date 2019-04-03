package com.capgemini.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.capgemini.client.School;

public class SchoolTest {
	private School Jnphs;
	private School Noble;
	private School Bhavans;
	 //name, city, school district, greatSchoolRanking
	@Before
	public void setUp() {
	Jnphs=new School("Jnphs","Hyderabad","Medchal",1);
	Noble=new School("Noble","Hyderabad","Medchal",2);
	Bhavans=new School("Bhavans","Hyderabad","Medchal",3);
	}
	@Test
	public void test1() {
		HashSet<School> schools =new HashSet<>();
		schools.add(Jnphs);
		schools.add(Noble);
		schools.add(Bhavans);
		assertEquals(3,schools.size());
	}
	@Test
	public void test2() {
		TreeSet<School> schools=new TreeSet<School>();
		schools.add(Bhavans);
		schools.add(Noble);
		schools.add(Jnphs);
		Iterator<School> iterator=schools.iterator();
		assertEquals("Bhavans",iterator.next().getSchoolName());
		assertEquals("Jnphs",iterator.next().getSchoolName());
		assertEquals("Noble",iterator.next().getSchoolName());
	}
	

}
