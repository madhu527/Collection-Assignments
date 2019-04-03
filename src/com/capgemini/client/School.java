package com.capgemini.client;

import static org.junit.Assert.*;

import org.junit.Test;

public class School implements Comparable<School> {
	 //name, city, school district, greatSchoolRanking
		private String schoolName;
		private String schoolCity;
		private String schoolDistrict;
		private double greatSchoolRanking;
		public School() {
			 
		}
		public School(String schoolName, String schoolCity, String schoolDistrict, double greatSchoolRanking) {
			super();
			this.schoolName = schoolName;
			this.schoolCity = schoolCity;
			this.schoolDistrict = schoolDistrict;
			this.greatSchoolRanking = greatSchoolRanking;
		}
		public String getSchoolName() {
			return schoolName;
		}
		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		public String getSchoolCity() {
			return schoolCity;
		}
		public void setSchoolCity(String schoolCity) {
			this.schoolCity = schoolCity;
		}
		public String getSchoolDistrict() {
			return schoolDistrict;
		}
		public void setSchoolDistrict(String schoolDistrict) {
			this.schoolDistrict = schoolDistrict;
		}
		public double getGreatSchoolRanking() {
			return greatSchoolRanking;
		}
		public void setGreatSchoolRanking(double greatSchoolRanking) {
			this.greatSchoolRanking = greatSchoolRanking;
		}
		@Override
		public int compareTo(School school){
			  
			return schoolName.compareTo(school.schoolName);
		}
		
		
		 

}
