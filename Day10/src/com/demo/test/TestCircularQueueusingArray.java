package com.demo.test;

import com.demo.queueusingarray.*;

public class TestCircularQueueusingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueueUsingArray ob=new CircularQueueUsingArray();
		ob.dequeue();
		ob.enqueue(56);
		ob.enqueue(65);
		ob.enqueue(71);
		ob.enqueue(17);
		ob.enqueue(67);
		ob.dequeue();
		
		
	}

}
