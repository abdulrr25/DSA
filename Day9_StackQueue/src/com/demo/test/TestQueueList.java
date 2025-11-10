package com.demo.test;

import com.demo.stackqueue.*;

public class TestQueueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueueList ob=new MyQueueList();
		ob.enqueue(34);
		ob.enqueue(98);
		
		ob.deQueue();
		ob.enqueue(78);
		ob.enqueue(89);
		
		ob.deQueue();
	

	}

}
