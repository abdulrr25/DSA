package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList ob =new SinglyLinkedList();
		ob.addNew(23);
		ob.addNew(34);
		ob.addNew(1);
		ob.addNew(233);
		ob.addNew(102);
		ob.DisplayList();
//		ob.addByPos(1, 56);
//		ob.addByPos(4, 100);
//		ob.addByPos(23, 103);
		ob.DeleteByValue(102);
		ob.DeleteByValue(23);
		ob.DisplayList();
	}

}
