package com.collection.iteratore;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Iteretore_Theory {

	public static void main(String[] args) 
	{
		//Enumeration Iterator
		
				Vector vector=new Vector();
			
			 Enumeration e=vector.elements();
			 while(e.hasMoreElements())
			 {
			        Object i = e.nextElement();
			        System.out.println(i);
			 }
     // Iterator
			 
			 List<?> list=new ArrayList<>();
			 
			 Iterator iterat=list.iterator();
			 while(iterat.hasNext())
			 {
				Object it = iterat.next();
			 }
		    //remove()
			 
	//ListIterator
			ListIterator listiterator=list.listIterator();
			while(listiterator.hasNext())
			{
				Object lit = listiterator.next();
				System.out.println(lit);
			}
			
	}

}



//     Iterator/cursor

// the Iterable interface is the root interface for all collection and collection interface and implementation  class
// it contain only one abstract method Iterator<T> iterator()

//    type of Iterator
// 1.Enumeration
// 2.Iterator
// 3.ListIterator



//