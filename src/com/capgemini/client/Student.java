package com.capgemini.client;

import static org.junit.Assert.*;

import org.junit.Test;

public class Student {
	private double studentId;
	private String studentName;
	private String studentDept;
	public Student() {
		 
	}
	public Student(double studentId, String studentName, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}
	public double getStudentId() {
		return studentId;
	}
	public void setStudentId(double studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentDept == null) ? 0 : studentDept.hashCode());
		long temp;
		temp = Double.doubleToLongBits(studentId);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		Student other = (Student) obj;
		if (studentDept == null) {
			if (other.studentDept != null)
				return false;
		} else if (!studentDept.equals(other.studentDept))
			return false;
		if (Double.doubleToLongBits(studentId) != Double.doubleToLongBits(other.studentId))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
	

	  
	 
	 
}
