package com.demo.stackqueue;

public class MyQueueList {
	Node front;
	Node Rare;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	public MyQueueList() {
		front = null;
		Rare = null;
	}
	
	public boolean isEmpty() {
		return front==null && Rare==null;
	}
	
	public void enqueue(int val) {
		Node newnode = new Node (val);
		if(isEmpty()) {
			front=newnode;		
		}else {
			Rare.next = newnode;
		}
		Rare =newnode;
		System.out.println("Num Added: " +val);
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			Node temp=front;
			front=front.next;
			if(front==null) {
				Rare=null;
			}
			temp.next=null;
			System.out.println("Deleted data is\t" +temp.data);
			return temp.data;
			
		}else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

}
