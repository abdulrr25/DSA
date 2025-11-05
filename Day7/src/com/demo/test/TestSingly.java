package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSingly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList ob  = new SinglyLinkedList();
		ob.addNewNode(10);
		ob.addNewNode(20);
		ob.addNewNode(12);
		ob.addNewNode(454);
		ob.DisplayData();
		
		ob.deleteByData(20);
		ob.DisplayData();
		
		ob.deleteByPos(1);
		ob.DisplayData();

	}

}
