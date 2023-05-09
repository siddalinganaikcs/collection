package com.collection.list;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Queue_priorityQueue {

	public static void main(String[] args) 
	{
		PriorityQueue<Object> priorityqueue=new PriorityQueue();
		
		priorityqueue.add(85757);
		priorityqueue.add(657687);
		priorityqueue.add(2009099090);
		priorityqueue.add(20);
		priorityqueue.add(89576);
		priorityqueue.add(87970990);
		
	  System.out.println(priorityqueue);
//		for(Object i: priorityqueue)
//        {
//			System.out.println(i);
//		  }
		
		for(int i=0;i<priorityqueue.size();i++)
		{
			System.out.println(priorityqueue.poll());
		}
	}

}

//	    QUEUE
// QUEUE can store duplicate value
// QUEUE can store multiple null 
// QUEUE preserve insertion order
// QUEUE has index
//
//



//     priorityQueue
//priorityQueue  store duplicate value 
//priorityQueue don't store not even one single null value
//priorityQueue don't has index
//priorityQueue don't preserve insertion order
//priorityQueue underlying dataStructure in priority heap
//priorityQueue don't allow the heterogeneous

// priorityQueue  poll() method retrieve and remove the highest priority head element of the queue

// priorityQueue pree-define class
// priorityQueue present in java.util.pakage
// introducing jdk 1.2
//
//
//      priorityQueue constructor
// priorityQueue()========>
// priorityQueue(comparator c)====>
// priorityQueue(int initial capacity)====>
// priorityQueue(int initial capacity ,comparator c)===> 
//
// priorityQueue implementation  Synchronous
// priorityQueue is  a thread safe
// if multiple thread access on priorityQueue concurrency and at least one thread will modifies structure ,it will not impact on other thread
//




