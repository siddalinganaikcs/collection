package com.collection.list;

import java.util.Stack;

public class Stack_ {

	public static void main(String[] args) 
	{
		 
            Stack<Object> s=new Stack();
            s.push("sidda");
            s.push("sidda");
            s.push(768);
            s.push(78654);
            s.push(123);
            s.push(234.00);
            s.push(8799);
            
        System.out.println(s.pop()+"--pop--");
        System.out.println(s.peek()+"--peek--");
        System.out.println(s.empty()+"--empty--");
        System.out.println(s.search(768 )+"-search---");
        
//            for(Object i:s)
//            {
//            	System.out.println(i);
//            }
            
//            for(int i=0;i<s.size();i++)
//            {
//            	System.out.println(s.get(i));
//            }
//            
//            for(int i=0;i<s.size();i++)
//            {
//            	System.out.println(s.pop()+"popopopopop");
//            }
	}

}


//  Stack
//Stack can store duplicate value
//Stack can store multiple null 
//Stack preserve  insertion order first in last out
//underlying data structure is stack/linear

//the stock is a linear data structure that used to store the collection of object.it based on last in first out
// it's child of 

//  method of stack
//1.push()===> the push() method  pushes(insert) an element  to the top of the stock
//2.pop(E item)====> pop() method remove the element and return to the top of stack\\it remove the top object 
//3.peek()===>it return the top element of the stock
//4.empty()===>to check whether stack is empty or not
//5.search(Object o)=====> the method search the specified object and return the position of the object
//
//
//
//
//
//
//
//
//
//
//
//

