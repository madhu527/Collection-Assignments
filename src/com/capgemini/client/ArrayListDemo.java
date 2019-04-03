package com.capgemini.client;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String args) {
    ArrayList <String> names=new ArrayList<>();
    names.add("Alex");
    names.add("Madhu");
    names.add("kiran");
    names.add("Alex1");
    names.add("Alex2");
    /*Iterator<String> it=names.iterator();
    while(it.hasNext()) {
	   String name=it.next();
	   System.out.println(name);
	 
      }*/
    for(String name:names) {
    	System.out.println(name);
    }
  /*  for(Iterator<String> it=names.iterator();it.hasNext();  */
   }
}