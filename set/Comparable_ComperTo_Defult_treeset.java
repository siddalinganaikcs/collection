package com.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparable_ComperTo_Defult_treeset  {

	public static void main(String[] args) 
	{
		
        Naik n=new Naik(01, "naik", "ssp1230001");
		Naik n1=new Naik(02, "sidda", "ssp1230002");
		Naik n2=new Naik(03, "linga", "ssp1230003");
		Naik n3=new Naik(04, "raj", "ssp1230004");
		Naik n4=new Naik(05, "yash", "ssp1230005");
       
       TreeSet tree=new TreeSet();
       tree.add(n);
       tree.add(n2);
       tree.add(n3);
       tree.add(n1);
       tree.add(n4);
       
//       for(Naik na: tree)
//       {
//    	   System.out.println(na);
//       }
       Iterator iter=tree.iterator(); 
       while(iter.hasNext())
       {
    	  Naik na = (Naik) iter.next();
    	  System.out.println(na);
       }
	}

	
}

class Naik  implements Comparable<Naik>
{
	int id;
	String Nmae;
	String rollnO;

	public Naik(int id, String nmae, String rollnO)
	{
		super();
		this.id = id;
		Nmae = nmae;
		this.rollnO = rollnO;
	}

	@Override
	public int compareTo(Naik o) {
	
		return 	this.id-o.id;
	}


	@Override
	public String toString() {
		return "Naik [id=" + id + ", Nmae=" + Nmae + ", rollnO=" + rollnO + "]";
	}
	

}



//    << Comparable>>
// Comparable is pre-define interface in java.lang.package it is overridden to all Object method,String ,Wrapper class

// it only contain ***CompareTo(Object o); compareTo() is abstract method
// CompareTo() method compare the object and sort 
// we use comparable to default shorting 

// public int CompareTo(Object o)
//    this.id-o.id;  
// this.id will previous id it compare the given id
// if element is **greater then object id it will assign as +1
// if element is lesser then object id it will assign as -1
// if element is equals the object id it will assign as 0
 
//  Rule to make the object comparable 
// 1.class has to be implement comparable interface 
// 2.And specify the genaric to which object will sort
// 3.import the comparable interface
// 4.if u want sort the data based on only one parameter in one class then we use comparable interface 
// 5.we can give only one implementation for The comparableTo() method



















 


//