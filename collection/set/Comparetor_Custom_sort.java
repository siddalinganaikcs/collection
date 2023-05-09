package com.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Comparetor_Custom_sort {

	public static void main(String[] args) 
	{
		Custome cu1=new Custome(1, "sidda", "chowkasandra", "bnm123001");
		Custome cu2=new Custome(2, "naik", "chowkasandra", "bnm123002");
		Custome cu3=new Custome(3, "linga", "chowkasandra", "bnm123003");
		Custome cu4=new Custome(4, "raj", "chowkasandra", "bnm123004");
		Custome cu5=new Custome(5, "yash", "chowkasandra", "bnm123005");
		Custome cu6=new Custome(6, "sakku", "chowkasandra", "bnm123006");
		
		TreeSet<Custome> ts=new TreeSet(new CustomSort());
		ts.add(cu2);
		ts.add(cu1);
		ts.add(cu6);
		ts.add(cu4);
		ts.add(cu5);
		ts.add(cu3);
		
		
		Iterator etw=ts.iterator();
		while(etw.hasNext())
		{
			Object yt = etw.next();
			System.out.println(yt);
		}
		
	}

}

class Custome 
{
	int id;
	String name;
	String address;
	String usnNo;
	public Custome(int id, String name, String address, String usnNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.usnNo = usnNo;
	}
	public Custome() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Custome [id=" + id + ", name=" + name + ", address=" + address + ", usnNo=" + usnNo + "]";
	}

	
	
}

class CustomSort implements Comparator<Custome>
{

	@Override
	public int compare(Custome o1, Custome o2) {
		
		return o1.id-o2.id; 
	}
	
	
}


//  <<Comparetore>>

// Comparator is pre-define interface percent in Java.util.package
// it has abstract method called compare(),equals() method
// it used compare and sort object;
// Custom sorting
// Multiple implementation is possible in comparetor based on customer requirement

//if u want to sort based on multiple parameter for each parameter we should create different class and implement comparator

//  internal working

// ts.add(10); this 10 will convert to integer wrapper class like===>ts.add(Integer int=new Integer(10)) after converting,the refrenc variable will store in treeset
// if value is int,short,byte,long then there corresponding WraperClass compereTo() will call to camper 
// if value is String then STRING CLASS CompretO() WILL CALED===>COMPARETION BASED ON UNICODE  
// IF Vlaue is Object the Object class CompertO() WILL CALL












//
