package com.demo.test;

import com.demo.hashing.MyHashTable;

public class TestMyHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashTable ob=new MyHashTable();
		ob.insertData(45);
		ob.insertData(47);
		ob.insertData(2);
		ob.insertData(3);
		ob.insertData(7);
		ob.insertData(21);
		ob.insertData(25);
		ob.insertData(15);
		ob.insertData(12);
		ob.displayHashTAble();
		System.out.println();
		ob.deleteData(45);
		ob.displayHashTAble();
	}
}
