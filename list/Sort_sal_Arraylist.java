package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Sort_sal_Arraylist {

	public static void main(String[] args) {

		Employes cus1=new Employes(1, "siddu", 46778546467l, 54647.757);
		Employes cus2=new Employes(2, "naik", 46778546467l, 644647.757);
		Employes cus3=new Employes(3, "linga", 46778546467l, 984647.757);
		Employes cus4=new Employes(4, "cs", 46778546467l, 12647.757);
		Employes cus5=new Employes(5, "raj", 46778546467l, 674647.757);
		
		
		List<Employes> list=new ArrayList<Employes>();
		list.add(cus1);
		list.add(cus2);
		list.add(cus3);
		list.add(cus4);
		list.add(cus5);
		System.out.println(list+" before sort");
	
		 Collections.sort(list,new SortEmployee());
	
		System.out.println(" after after sort");
		
		for(Employes c:list)
		{
			System.err.println(c);
		}
		
		System.out.println("greter then >30000");
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Employes im=(Employes)it.next();
			if(im.sal>30000)
			{
				System.out.println(im);
			}
		}

	}

}
class Employes   
{
	int id;
	String name;
	long pnno;
	double sal;
	public Employes(int id, String name, long pnno,double sal) {
		super();
		this.id = id;
		this.name = name;
		this.pnno = pnno;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Employes [id=" + id + ", name=" + name + ", pnno=" + pnno + ", sal=" + sal + "]";
	}
	
	
}

class SortEmployee implements Comparator<Employes>
{

	@Override
	public int compare(Employes o1, Employes o2) {
		
		return (int) (o1.sal-o2.sal);
	}
	
}
