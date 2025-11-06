package com.demo.beans;

public class DoublyLinkedList {
	Node head;
    class Node{
    	int data;
    	Node prev,next;
		public Node(int data) {
			this.data = data;
			prev=null;
			next=null;
		}
    }

	public DoublyLinkedList() {
		head = null;
	}

	public void addNode(int n) {
		Node newNode = new Node(n);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;		}
	}

	public void addByValue(int value, int num) {
		Node newnode = new Node(num);

		Node temp = head;

		while (temp != null && temp.data != value) {
			temp = temp.next;
		}
		if (temp != null) {
			newnode.next = temp.next;
			newnode.prev = temp;
			temp.next.prev = newnode;
			temp.next = newnode;
		} else {
			System.out.println("Not found");
		}

	}

	public void addByPos(int pos, int data) {
		Node newNode = new Node(data);

		if (pos == 1) {
			newNode.next = head;
			newNode.prev = null;
			head = newNode;

		} else {
			Node temp = head;

			for (int i = 0; i < pos - 2 && temp.next != null; i++) {
				temp = temp.next;
			}
			if (temp != null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				if (temp.next != null) {

					temp.next.prev = newNode;

				}
				temp.next = newNode;
			} else {
				System.out.println("Position Not Found");
			}
		}

	}

	public void deleteByValue(int val) {
		Node temp = head;
		if (temp == head) {
			head = temp.next;
			if (head != null) {
				head.prev = null;
			}
		} else {

			while (temp != null && temp.data != val) {
				temp = temp.next;
			}
			if (temp != null) {
				temp.prev.next = temp.next;
				if (temp.next != null) {
					temp.next.prev = temp.prev;
					temp.next = null;
				}
				temp.prev = null;
			} else {
				System.out.println("Value does not exist");
			}
		}

	}

	public void deleteByPos(int pos) {
    	Node temp=head;
		if(pos==1) {
			head=temp.next;
			head.prev=null;
		}else {
			for(int i=0;temp!=null && i<pos-1;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
					temp.next.prev=temp.prev;
					temp.next=null;
				}
				temp.prev=null;
			}else {
				System.out.println(pos + " is beyond the limit of the list");
			}
		}
	}

	public void displayData() {
		if (head == null) {
			System.out.println("Array is empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ----> ");
				temp = temp.next;
			}
		}
	}
}
