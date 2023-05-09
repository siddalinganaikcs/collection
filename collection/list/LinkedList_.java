package com.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedList_ {

	public static void main(String[] args) 
	{
		
		List<Object> list=new LinkedList<>();  
		list.add("naik");
		list.add(1234);
		list.add(100.0);
		list.add('d');
		list.add("naik");
		list.add(null);
		list.add(null);
		System.out.println(list);

		
		for(Object i:list)//for each loop to iterating//poll()
		{
			System.out.println(i);
		}
		 
		for(int i=0;i<list.size();i++)//for loop to iterating//poll()
		{
			System.out.println(list.get(i));
		}
	}

}

//        LinkedList
// LinkedList can store duplicate value
// LinkedList can store multiple null 
// LinkedList preserve insertion order
// LinkedList has index
// LinkedList data structure is doubly linkedList stored in form of nodes and nodes store address the previous and next object address

// LinkedList introduce 1.2jdk version
// LinkedList is pre-define interface
// LinkedList is present java.util.pakage
  
// LinkedList implementation is not synchronous
// LinkedList is  thread not safe
// if multiple thread accuses to LinkedList concurrently ,and atleast one thread will modifise structure ,it will impact on other thread

//    LinkedList Constructor
// LinkedList()====>e
// LinkedList(Collection c)======>its containing the element of specified collection

//when we use linedList 
//linedList too past when store the data because it has stored non-sequential order /non-linear order
//ArrayList too slow when retrieving the data ,because non-sequential order operation will happen 




