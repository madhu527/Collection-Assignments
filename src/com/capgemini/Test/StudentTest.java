package com.capgemini.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.client.Student;

public class StudentTest {

	private Student madhu;
	private Student kaushik;
	private Student venky;
	@Before
	public void setUp() {
	madhu=new Student(123,"madhu","cse");
	kaushik=new Student(124,"kaushik","mech");
	venky=new Student(125,"venky","ece");
	}
	
	@Test
	public void test1() {
		HashSet<Student> students=new HashSet<>();
		students.add(madhu);
		students.add(kaushik);
		students.add(venky);
		assertEquals(3,students.size());
		
	}
	
}
