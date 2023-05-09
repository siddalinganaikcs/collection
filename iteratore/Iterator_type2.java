package com.collection.iteratore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_type2 {

	public static void main(String[] args) 
	{
		List<Object> list=new ArrayList<>();  
		
		list.add("naik");
		list.add(1234);
		list.add(100.0);
		list.add('d');
		list.add("naik");
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Object li = iter.next();
			System.out.println(li);
		}

	}

}

//     Iterator 1.2 version
//  it is Universal iterator to retrieve the element we can apply to any collection framework like list,Set,Queue,Dequeue and all implemented class of map interface
//  by using iterator we can perform *read and *remove operation
//  Iterator is the improved version of enumeration

//  Iterator object can be created by calling iterator() method  percent in collection interface ===> Iterator iter=collec.iterator();

//    methods of iterator
// 1.hashNext()====> return true if iterator has more elements
// 2.next()    ====> return the next iterator in the elements  and  throw throw *NoSuchElements Exception 
// 3.remove() ====> it remove the next elements in the iteration
//      throw exception
//    3.a.UnsupportedOpertion Exception
//    3.b.IlligaleState Exception


//  Advanteges
// we can use it for any collection class
// it support both read and remove operation
// it universal cursor for collection API

// Limitation
// only Forward direction iterator
// it's only perform read,remove 






//