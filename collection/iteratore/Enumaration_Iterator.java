package com.collection.iteratore;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Enumaration_Iterator {

	public static void main(String[] args) 
	{
		Vector<Object> vectore=new Vector<>();  
		vectore.add("naik");
		vectore.add(1234);
		vectore.add(100.0);
		vectore.add('d');
		vectore.add("naik");
		vectore.add(null);
		vectore.add(null);
		System.out.println(vectore+"vectore list");
		
		Enumeration enuma=vectore.elements();
		while(enuma.hasMoreElements())
		{
			Object li = enuma.nextElement();
			System.out.println(li);
		}
		

	}

}

// it is a interface used to get element of legacy collection(Vector, hash table)
// we can create  enumeration object by using element() method of vector class
// introduced in 1.0 jdk(for legacy)

// creating object====> Enumartion enum=vectore.elements();

//   methods of enumeration
// 1.HasmoreElenets()====> this method tests if this enumeration contain more element or not
// 2.nextelement()=====> this method return the next element of this enumeration

//   Drawback/Limitation
// 1. its only applicable foe legacy collection class(Vectore,hashtable) not for any other class
// 2. only forward direction retrieving
// 3. remove operation con't performed in enumeration
