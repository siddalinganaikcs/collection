package com.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Removed_Duplicate_arraylist {

	public static void main(String[] args)
	{
		Customer cus1=new Customer(1, "siddu", 46778546467l);
		Customer cus2=new Customer(2, "naik", 646778546467l);
		Customer cus3=new Customer(1, "linga", 677854646557l);
		Customer cus4=new Customer(3, "cs", 778546465755l);
		Customer cus5=new Customer(4, "raj", 854646545557l);
		
		List<Customer> list=new ArrayList<Customer>();
		list.add(cus1);
		list.add(cus2);
		list.add(cus3);
		list.add(cus4);
		list.add(cus5);
		System.out.println(list+" before removing duplicate");
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))//content compartion
				{
					list.remove(j);
				}
			}
		}
//		
		System.out.println(list+" after removing duplicate");
		
		for(Customer c:list)
		{
			System.err.println(c);
		}

	}

}
class Customer// if u want remove duplicate value the we should override hashcode value and equals
{
	int id;
	String name;
	long pnno;
	public Customer(int id, String name, long pnno) {
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
	public boolean equals(Customer obj) {
		
		return this.id == obj.id;
	}
	
	
}