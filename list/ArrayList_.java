package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {

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

//        ArrayList
// ArrayList can store duplicate value
// ArrayList can store multiple null 
// ArrayList preserve insertion order
// ArrayList has index
//underlying data structure is resizeble array/grovable array

//ArrayList introduce 1.2jdk version
//ArrayList is pre-define interface
//ArrayList is present java.util.pakage
  
//ArrayList implementation is not synchronous
//ArrayList is not thread safe
//if multiple thread accuses to ArrayList concurrently ,and atleast one thread will modifise structure ,it will impact on other thread

//    ArrayList Constructor
// ArrayList()====>empty constructor initial capacity is 10 
//ArrayList(Collection c)======>its containing the element of specified collection
//ArrayList(int initial capacity)====>it will increase the (initial capacity *3/2)+1


//when we use ArrayList 
// ArrayList too past when retrieving the data because it has stored sequential order /linear order
// ArrayList too slow when data store,because shifting operation will happen 
