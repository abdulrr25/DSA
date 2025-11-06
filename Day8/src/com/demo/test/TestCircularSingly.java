package com.demo.test;

import com.demo.linkedlist.CircularSinglyLinkedList;

public class TestCircularSingly {
	public static void main(String args[])
	{
		CircularSinglyLinkedList ob =new CircularSinglyLinkedList();
		ob.addNode(15);
		ob.addNode(23);
		ob.addNode(2);
		ob.addByValue(23,15);
		ob.addByPosition(2,112);


		ob.displayData();
	}
}
