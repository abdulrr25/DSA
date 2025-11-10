package com.demo.tree;

public class MyBinarySearchTree {

	Node root;

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public MyBinarySearchTree() {
		root = null;
	}

	public void insertnode(int key) {
		root = insertdata(root, key);
	}

	private Node insertdata(Node root, int key) {

		Node newnode = new Node(key);
		if (root == null) {
			root = newnode;
			return root;
		} else {
			if (key < root.data) {
				root.left = insertdata(root.left, key);
			} else {
				root.right = insertdata(root.right, key);
			}
			return root;
		}

	}

	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
		// TODO Auto-generated method stub

		if (root != null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
		}

	}

	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		// TODO Auto-generated method stub

		if (root != null) {
			System.out.println(root.data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

	}

	public void postorder() {
		postordertraversal(root);
		System.out.println();
	}

	private void postordertraversal(Node root) {
		// TODO Auto-generated method stub

		if (root != null) {
			postordertraversal(root.left);
			postordertraversal(root.right);
			System.out.println(root.data);
		}

	}

	public void deleteNode(int Key) {
		root = deletedata(root, Key);
		System.out.println();
	}

	private Node deletedata(Node root, int key) {
		// TODO Auto-generated method stub

		if (root == null) {
			return root;
		}
		if (key < root.data) {
			root.left = deletedata(root.left, key);
		} else if (key > root.data) {
			root.right = deletedata(root.right, key);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {

				return root.left;
			}
			System.out.println(root.data);
			root.data = minvalue(root.right);
			root.right = deletedata(root.right, root.data);

		}
		return root;
	}

	private int minvalue(Node right) {
		// TODO Auto-generated method stub

		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	public boolean Search(int key) {
		return SearchBinaryTree(root, key);
	}

	private boolean SearchBinaryTree(Node root, int key) {
		// TODO Auto-generated method stub

		if (root != null) {
			if (root.data == key) {
				System.out.println("Data found\t" + key);
				return true;
			} else if (key < root.data) {
				return SearchBinaryTree(root.left, key);
			} else {
				return SearchBinaryTree(root.right, key);
			}
		}
		System.out.println("Not found\t" + key);
		return false;
	}
}
