package com.demo.beans;

public class SinglyLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	public SinglyLinkedList() {
		head = null;
	}

	public void addNew(int v) {
		Node newNode = new Node(v);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = null;
		}
	}

	public void addByValue(int n, int val) {
		Node newNode = new Node(val);
		Node temp = head;

		while (temp != null && temp.data != n) {
			temp = temp.next;
		}
		if (temp.data == n) {
			newNode.next = temp.next;
			temp.next = newNode;
		} else {
			System.out.println("Entered number not found");
		}

	}

	public void addByPos(int pos, int val) {
		Node newNode = new Node(val);
		if (pos == 1) {
			newNode.next = head.next;
			head.next = newNode;
		} else {
			Node temp = head;
			int i = 0;
			for (; temp != null && i < pos - 2; i++) {
				temp = temp.next;
			}
			if (temp != null) {

				newNode.next = temp.next;
				temp.next = newNode;
			} else {
				System.out.println("Position not found");
			}
		}
	}

	public void DeleteByValue(int val) {
		Node temp = head;
		if (temp.data == val) {
			head = temp.next;
			temp.next = null;
		} else {

			Node prev = null;
			while (temp.data != val && temp != null) {
				prev = temp;
				temp = temp.next;
			}
			if (temp != null) {
				prev.next = temp.next;
				temp.next = null;
			} else {
				System.out.println("Value not found");
			}
		}

	}

	public void DisplayList() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			for (Node temp = head; temp != null; temp = temp.next) {
				System.out.print(temp.data + "---->");
			}
			System.out.println("Null");
		}
	}
}
