package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Set_ {

	public static void main(String[] args) 
	{
		Set set=new HashSet();
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




//     Set
// Set don't store duplicate value 
// set don't store multiple null value
// set don't has index
// set don't preserve insertion order
//
//set pree-define interface
// set present in java.util.pakage
// introducing jdk1.2
//
//set have 3 implementation class
//  1.HashSet
//  2.linked hashSet
//  3.treeSet
//
//
//
//
//
//
//
//


