package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList ob  = new SinglyLinkedList();
		ob.addNewNode(10);
		ob.addNewNode(20);
		ob.addNewNode(12);
		ob.addNewNode(454);
		ob.DisplayData();
		
//		ob.Addpos(8, 34);
//		System.out.println("List after entering value at a given position");
//		ob.DisplayData();
		
		ob.AddByValue(9, 45);
		System.out.println("List after entering value at a given value");
		ob.DisplayData();
	}
}
