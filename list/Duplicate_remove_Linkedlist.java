package com.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Duplicate_remove_Linkedlist {

	public static void main(String[] args) 
	{
		Employee cus1=new Employee(1, "siddu", 4677.88);
		Employee cus2=new Employee(2, "naik", 6467785.98);
		Employee cus3=new Employee(1, "linga", 6778546.09);
		Employee cus4=new Employee(3, "cs", 778546.78);
		Employee cus5=new Employee(4, "raj", 85464654.90);
		
		List<Employee> likedlist=new LinkedList<Employee>();
		likedlist.add(cus1);
		likedlist.add(cus2);
		likedlist.add(cus3);
		likedlist.add(cus4);
		likedlist.add(cus5);
		System.out.println(likedlist+" before remove");

		for (int i = 0; i < likedlist.size(); i++) {
			for (int j = i + 1; j < likedlist.size(); j++) {
				if (likedlist.get(i).equals(likedlist.get(j)))// content compartion
				{
					likedlist.remove(j);
				}
			}
		}

		for (Employee emp : likedlist) {
			System.out.println(emp);
		}

	}

}

class Employee
{
	int emp_Id;
	String emp_Name;
	double sal;
	public Employee(int emp_Id, String emp_Name, double sal) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return emp_Id;
	}
	public boolean equals(Employee obj) {
		return this.emp_Id==obj.emp_Id;
	}
	
}
