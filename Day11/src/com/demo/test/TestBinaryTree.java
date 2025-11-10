package com.demo.test;

import com.demo.tree.*;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBinarySearchTree ob = new MyBinarySearchTree();
		ob.insertnode(31);
		ob.insertnode(15);
		ob.insertnode(17);
		ob.insertnode(18);
		ob.insertnode(10);
		ob.insertnode(40);
		ob.insertnode(32);
		ob.insertnode(45);
		ob.insertnode(33);
		
		System.out.println("Inorder Tree");
		ob.inorder();
		System.out.println("Preorder Tree");
		ob.preorder();
		System.out.println("Postorder Tree");
		ob.postorder();

		ob.deleteNode(18);
		ob.deleteNode(32);
		ob.deleteNode(15);
		
		
		
		ob.Search(10);
		ob.Search(90);

	}

}
