package com.collection.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import com.collection.iteratore.Iteretore_Theory;

public class Sort_sal_hashset {

	public static void main(String[] args) 
	{
		Employees emp=new Employees(1, "sidda", 64546.967);
		Employees emp1=new Employees(2, "linga", 7454.967);
		Employees emp2=new Employees(3, "naik", 89454.967);
		Employees emp3=new Employees(4, "cs", 84545.967);
		Employees emp4=new Employees(5, "avvi", 666445.967);
		Employees emp5=new Employees(6, "raj", 9465.967);
		
		Set<Employees> set =new HashSet<Employees>();
		set.add(emp);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		
		System.out.println(set+"before sort");
		
	TreeSet<Employees> tree=new TreeSet<Employees>(new HashSort());
	tree.addAll(set);
	
	System.out.println("after sorting desending order");
	
	for(Employees im:tree)
	{
		System.out.println(im);
	}
	
	
	
	System.out.println("-----------greterthen 30000 sal");
	
	Iterator it=tree.iterator() ;
	while(it.hasNext())
	{
		Employees ni =(Employees) it.next();
		if(ni.sal>30000)
		{
			System.out.println(ni);
		}
		
	}
		
		

	}

}
class Employees 
{
	int id;
	String name;
	Double sal;
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
	
	
	
	
	
}

class HashSort implements Comparator<Employees>
{

	@Override
	public int compare(Employees o1, Employees o2) {
		return (o2.sal.compareTo(o1.sal));
	}
	
}