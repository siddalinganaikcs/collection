package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_ {

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

		
		for(Object i:list)//for each loop to iterating
		{
			System.out.println(i);
		}
		 
		for(int i=0;i<list.size();i++)//for loop to iterating
		{
			System.out.println(list.get(i));
		}
	}

}

//        list
// list can store duplicate value
// list can store multiple null 
// list preserve insertion order
// list has index

//list introduce 1.2jdk version
//list is pre-define interface
//list is present java.util.pakage
//list has 4 implementation class
//    1.ArrayList
//    2.Vector list
//    3.LinkedList
//    4.Stock

//    Pre-define method of list
// 1.get()       ========> get() method used get the element of an index
// 2.set(index,object)===>based on index position we set/update the object//overridden
// 3.add(index,object)===>based on index position we add the object and its shift next position
// 4.indexOf()    =======>first index element
// 5.lastindexOf() ======>last index element


