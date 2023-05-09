package com.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ {

	public static void main(String[] args) 
	{
		Set<Object> linkset=new LinkedHashSet();
		linkset.add("siddu");
		linkset.add("siddu");
		linkset.add(null);
		linkset.add(null);
		linkset.add(20.00);
		linkset.add(20);
		linkset.add(false);
		linkset.add('d');
		
		for(Object i: linkset)
        {
			System.out.println(i);
		}
	}

}




//     LinkedHashSet
// LinkedHashSet don't store duplicate value 
// LinkedHashSet don't store multiple null value
// LinkedHashSet don't has index
// LinkedHashSet it preserve insertion order
// LinkedHashSet underlying dataStructure IS LinkedHashTable/liked list

// LinkedHashSet pree-define class
// LinkedHashSet present in java.util.pakage
// LinkedHashSet jdk 1.2
//
//
//      HashSet constructor
// LinkedHashSet()========>initial capacity is  16
// LinkedHashSet(Collection c)====>it containing element in the specified collection
// LinkedHashSet(int initial capacity)====>increment capacity when 75% of initial set will load==(16/(75/100))=12+16=28,(28/(75/100))=21+28=49
// LinkedHashSet(int initial capacity ,float,loadFactore)===> a new empty set with the specific initial capacity and the specific loadFactore
//
// HashSet implementation not Synchronous
// HashSet is not a thread safe
// if multiple thread access on hashSet concurrency and at least one thread will modifies structure ,it will impact on other thread



