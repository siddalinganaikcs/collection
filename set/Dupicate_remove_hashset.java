package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class Dupicate_remove_hashset {

	public static void main(String[] args)
	{
		Customers cus1=new Customers(1, "siddu", 46778546467l);
		Customers cus2=new Customers(2, "naik", 646778546467l);
		Customers cus3=new Customers(1, "linga", 677854646557l);
		Customers cus4=new Customers(3, "cs", 778546465755l);
		Customers cus5=new Customers(4, "raj", 854646545557l);
		
		Set<Customers> set=new HashSet <Customers>();
		set.add(cus1);
		set.add(cus2);
		set.add(cus3);
		set.add(cus4);
		set.add(cus5);
		System.out.println(set+" before removing duplicate");
		
//		for(int i=0;i<list.size();i++)
//		{
//			for(int j=i+1;j<list.size();j++)
//			{
//				if(list.get(i).equals(list.get(j)))//content compartion
//				{
//					list.remove(j);
//				}
//			}
//		}
//	   
//		TreeSet tree=new TreeSet<>();
//		tree.addAll(set);
		
		System.out.println(set+" after removing duplicate");
		
		for(Customers c:set)
		{
			System.err.println(c);
		}

	}

}
class Customers // if u want remove duplicate value the we should override hashcode value and equals
{
	int id;
	String name;
	long pnno;
	public Customers(int id, String name, long pnno) {
		super();
		this.id = id;
		this.name = name;
		this.pnno = pnno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", pnno=" + pnno + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	public boolean equals(Object c) {
		
		return this.id== c.hashCode();
		
	}

	
}
