package com.demo.hashing;

public class MyHashTable {
	Node[] heads;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public MyHashTable() {
		heads = new Node[10];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;

		}

	}

	public MyHashTable(int size) {
		heads = new Node[size];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;
		}

	}

	public void insertData(int val) {
		Node newNode = new Node(val);
		int pos = val % heads.length;
		if (heads[pos] != null) {
			newNode.next = heads[pos];
		}
		heads[pos] = newNode;
	}

	public void displayHashTAble() {
		for (int i = 0; i < heads.length; i++) {
			Node temp = heads[i];
			System.out.print(i + "------>");
			while (temp != null) {
				System.out.print(temp.data + "----------->");
				temp = temp.next;
			}
			System.out.println("Null");
		}
	}

	public boolean searchData(int num) {
		int pos = num % heads.length;
		Node temp = heads[pos];
		while (temp != null) {
			if (temp.data == num) {
				System.out.println(num + "Num found");
				return true;
			}
			temp = temp.next;
		}
		System.out.println(num + "not found");
		return false;
	}

	public void deleteData(int key) {
		int pos = key % heads.length;
		Node temp = heads[pos];
		Node prev = null;
		if (temp == null) {
			System.out.println("Deletion not possible");
		} else {

			while (temp != null) {
				if (temp.data == key) {
					if (prev == null) {

						heads[pos] = temp.next;
					} else {
						prev.next = temp.next;
					}
					System.out.println("Node Deleted");
					return;
				} else {
					prev = temp;
					temp = temp.next;
				}

			}
		}

	}

}
