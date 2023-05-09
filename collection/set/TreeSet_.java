package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {

	public static void main(String[] args) 
	{
		Set<Object> treeset=new TreeSet();
		treeset.add(85757);
		treeset.add(657687);
	    treeset.add(20);
		treeset.add(20);
		treeset.add(6576);
		treeset.add(8797);
		
		for(Object i: treeset)
        {
			System.out.println(i);
		}
	}

}




//     TreeSet
// TreeSet don't store duplicate value 
// TreeSet don't store not even one single null value
// TreeSet don't has index
// TreeSet don't preserve insertion order
// TreeSet underlying dataStructure in binary search/natural shorting//ascending order
// TreeSet it contains node and list ==>Nod contains data and address of the other data ,==links represent relation b/w one nod to another nod
// TreeSet don't allow the heterogeneous

// TreeSet pree-define class
// TreeSet present in java.util.pakage
// introducing jdk 1.2
//
//
//      TreeSet constructor
// TreeSet()========>default sorting
// TreeSet(Collection c)====> customized sorting
// TreeSet(Collection c)====> it containing element in the specified collection       
// TreeSet(SortedSet s)===> it provide functionality to keep the element sorted
//
// TreeSet implementation not Synchronous
// TreeSet is not a thread safe
// if multiple thread access on hashSet concurrency and at least one thread will modifies structure ,it will impact on other thread
//
// 



