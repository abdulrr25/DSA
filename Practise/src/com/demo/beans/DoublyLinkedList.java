package com.demo.beans;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node Next,prev;
		public Node(int data) {
			this.data=data;
			Next=null;
			prev=null;
		}
	}
	public DoublyLinkedList() {
		head = null;
	}
	public void addNode(int val) {
		Node newNode = new Node(val);
		if(head==null) {
			head.Next=newNode;
			newNode.Next=null;
			newNode.prev=head;
		}
		else {
			Node temp = head;
			while(temp.Next!=null) {
				temp=temp.Next;
			}
			newNode.prev=temp;
			temp.Next=newNode;
		}
	}
	
	
}
