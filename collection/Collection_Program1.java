package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_Program1 {

	public static void main(String[] args) 
	{
		int a=10;// in a variable we can store only one value
		   System.out.println(a);
		
		int [] arr= {10,20,30,40,50}; //in a array we can store multiple value but same data type(homogeneous) ,and fixed length 
                 System.out.println(Arrays.toString(arr));
		
		
		
		List<Object> list=new ArrayList<Object>();// in collection we can store multiple value/Object(heterogeneous,homogeneous)type of data and resizebale array 
		list.add(12);
		list.add("siddu");
		list.add(23.09);
		list.add('c');
		list.add(false);
		//System.out.println(list.remove(2);
		//
		
		List<Object> list1=new ArrayList<Object>();
		list1.add("naik");
		list1.addAll(list);
		System.out.println(list1);
		
		System.out.println(list);
	}

}


//  Collection free_define method
//
//  1. add()
//  2. addAll()
//  3.remove()
//  4.removeAll()
//  5.contain()
//  6.containAll()
//  7.is.Empty()
//  8.clear()
//  9.size()
// 10.iterator()
//
// these method  applicable for all list,set queue






