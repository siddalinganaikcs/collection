package com.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sort_Sal_linkedlist {

	public static void main(String[] args) 
	{
		Employees emp=new Employees(1, "siddu",546477.0);
		Employees emp1=new Employees(2, "naik",7565.0);
		Employees emp2=new Employees(3, "linga",98454.0);
		Employees emp3=new Employees(4, "raj",52323.0);
		Employees emp4=new Employees(5, "cs",12343.0);
		Employees emp5=new Employees(6, "avvi",094746.0);
		
		List<Employees> list=new LinkedList<Employees>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		System.out.println(list+"before shortimh");
		
		Collections.sort(list);
		System.out.println("after sorting");
		
		for(Employees empp:list)
		{
			System.out.println(empp);
		}
		
		System.out.println("greter then >30000");
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Employees im=(Employees)it.next();
			if(im.sal>30000)
			{
				System.out.println(im);
			}
		}

	}

}
class Employees implements Comparable<Employees>
{
	int id;
	String name;
	double sal;
	public Employees(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employees o) {
		
		return (int) (this.sal-o.sal);
	}
	
}
