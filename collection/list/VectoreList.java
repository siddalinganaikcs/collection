package com.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectoreList {

	public static void main(String[] args) 
	{
		List<Object> list=new Vector<>();  
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

//        Vector
// Vector can store duplicate value
// Vector can store multiple null 
// Vector preserve insertion order
// Vector has index
// Vector data structure is resizeble array/grovable array

// Vector introduce 1.0jdk version
// Vector is pre-define interface
// Vector is present java.util.pakage
  
// Vector implementation is  synchronous
// Vector is  thread safe
// if multiple thread accuses to Vector concurrently ,and atleast one thread will modifise structure ,it will not impact on other thread

//    Vector Constructor
// Vector()====>empty constructor initial capacity is 10 
//Vector(Collection c)======>its containing the element of specified collection
//Vector(int initial capacity)====>it will increase the (initial capacity *2)
//Vector(int initial capacity,int capacity increment)===>programmer can controlled to capacity of vector
	


