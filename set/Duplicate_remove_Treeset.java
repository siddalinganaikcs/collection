package com.collection.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;



public class Duplicate_remove_Treeset {

	public static void main(String[] args) 
	{
		Employee cus1=new Employee(1, "siddu", 4677.88);
		Employee cus2=new Employee(2, "naik", 6467785.98);
		Employee cus3=new Employee(1, "linga", 6778546.09);
		Employee cus4=new Employee(3, "cs", 778546.78);
		Employee cus5=new Employee(4, "raj", 85464654.90);
		
		Set<Employee> tree=new TreeSet <Employee>();
		tree.add(cus1);
		tree.add(cus2);
		tree.add(cus3);
		tree.add(cus4);
		tree.add(cus5);
		System.out.println(tree);

	}

}
class Employee implements Comparable<Employee>
{
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		 this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	public boolean equals(Employee obj) {
		return this.id==obj.id;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.id- o.id;
	}
	
	
	
}