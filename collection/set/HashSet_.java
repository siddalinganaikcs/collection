package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {

	public static void main(String[] args) 
	{
		

		Set<Object> set=new HashSet();
		set.add("siddu");
		set.add("siddu");
		set.add(null);
		set.add(null);
		set.add(20.00);
		set.add(20);
		set.add(false);
		set.add('d');
		
		for(Object i: set)
        {
			System.out.println(i);
		}
	}

}




//     HashSet
// HashSet don't store duplicate value 
// HashSet don't store multiple null value
// HashSet don't has index
// HashSet don't preserve insertion order
// HashSet underlying datasTRUCTURE IS HASHtABLE/HashSet

// HashSet pree-define class
// HashSet present in java.util.pakage
// introducing jdk 1.2
//
//
//      HashSet constructor
// HashSet()========>initial capacity is  16
// HashSet(Collection c)====>it containing element in the specified collection
// HashSet(int initial capacity)====>increment capacity when 75% of initial set will load==(16/(75/100))=12+16=28,(28/(75/100))=21+28=49
// HashSet(int initial capacity ,float,loadFactore)===> a new empty set with the specific initial capacity and the specific loadFactore
//
// HashSet implementation not Synchronous
// HashSet is not a thread safe
// if multiple thread access on hashSet concurrency and at least one thread will modifies structure ,it will impact on other thread
//
// When we use HashSet and LinkedHashSet
// when u want insertion order then u choose linkedHashSet else H ashSet