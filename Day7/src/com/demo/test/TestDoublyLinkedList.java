package com.demo.test;

import com.demo.beans.DoublyLinkedList;

public class TestDoublyLinkedList {
	public static void main(String args[]) {
		DoublyLinkedList ob = new DoublyLinkedList();
		ob.addNode(12);
		ob.addNode(15);
		ob.addNode(11);
		ob.addNode(10);
		ob.addNode(155);
		ob.addNode(14);
//		ob.displayData();
//		ob.addByPos(5, 21);
//		ob.addByValue(112, 201);
//		ob.deleteByValue(11);
		
		ob.deleteByPos(3);
		ob.displayData();


	}
}
