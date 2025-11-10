package com.demo.test;


import com.demo.circulardoublylinkedlist.*;
public class TestCIrcularDoublyLinkedList {

	public static void main(String[] args) {
		CircularDoublyLinkedList clist=new CircularDoublyLinkedList();
		clist.addNode(10);
		clist.addNode(20);
		clist.addNode(11);
		clist.addNode(1);
		clist.displayData();
		clist.displayDataReverse();
		
		
		
	
		
		
		System.out.println("LinkedList after Adding value at a given number");
		clist.addByValue(100,10);
		clist.addByValue(110,20);
		clist.addByValue(150,1);
		clist.displayData();
		
		System.out.println("\n LinkedList after adding value at a given position");
		clist.addByPosition(2, 46);
		clist.addByPosition(4, 197);
		clist.displayData();
		
		System.out.println("\n LinkedList after deleting value at a given number");
		clist.deleteByValue(10);
		clist.deleteByValue(11);
		clist.deleteByValue(1);
		clist.deleteByValue(45);
		clist.displayData();
		
		System.out.println("LinkedList after deleting value at a given position");
		clist.deleteByPosition(3);
		

	}

}
