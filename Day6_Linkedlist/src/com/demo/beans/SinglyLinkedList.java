package com.demo.beans;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int x) {
			data=x;
			next=null;
		}
	}
	public SinglyLinkedList() {
		head=null;
	}
	public void addNewNode(int n) {
		Node newNode = new Node(n);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public void DisplayData() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+"--->");
			}
			System.out.println("null");
		}
			
			//For(temp=head;temp!=null;temp=temp.next
		
	}
	public void AddBypos(int pos, int data) {
		Node newNode= new Node(data); 
		if(pos==1) {
			 newNode.next = head; 
			    head = newNode;
			
		}
		else {
			Node temp =head;
			for(int i=0;i<pos-2 && temp!=null;i++) {
				temp=temp.next;
			}
				
				if(temp!=null) {
					newNode.next = temp.next;
					temp.next=newNode;
				}
				else {
					System.out.println("Given position is beyond length");
				}
		}
		
		
	}
	public void AddByValue(int num, int value) {
		Node newNode = new Node(value);
		
		Node temp =head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
		}
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next = newNode;
			
		}else {
			System.out.println("Not found");
		}
	}
}
