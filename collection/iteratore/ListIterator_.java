package com.collection.iteratore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListIterator_ {

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
		
		ListIterator listiter=list.listIterator();
		while(listiter.hasNext())
		{
			Object li = listiter.next();
			System.out.println(li);
		}

	}

}

//     ListIteretor 1.2 version
// By using list iterator we can forward direction and all so backward direction and hence listItertor bidirectional
// By using list iterator we can perform read,remove,replacement and addition of object

// creating of object listIterator ListIterator()=====>ListIterator listiter=list.ListIterator()

//   Methods oF ListIterator
// forward direction
//    1.hashNext()  =====> return true if listIterator has more element
//    2.next()      ====> return the next element of the iterator
//    3.nextIndex() ====> return the next index of the element
 
// BackWard Direction
//  4.hasPrevious()  ====> return true if listIterator has more element for retrieving backward
//  5.previous()    ====> return the previous element in the iterator and throw NoSuchElement Exception
//  6.previousIndex()===> return the previous element and list of element if index position is last

// 7.remove()====> remove the next element
// 8.add(Object obj) ====>insert the specified element to the list before the previous element
// 9.set(Object obj)===> replace the element next() or previous() with the specified element


//  lIMITATION OF LISTITERATOR
// 1.iT'S not a Universal cursor
// it only applicable list implemented class










//