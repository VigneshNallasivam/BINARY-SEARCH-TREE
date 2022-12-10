package com.oops.basics;

import com.oops.basics.CreateNodes.Node;

public class CreateTree 
{
	/*
	 * Declaring Required Binary Search Tree Variables & Initializing data using Constructor
	 */
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
		}
	}

	/*
	 * Zero-argument Constructor for Root
	 */
	Node root;
	CreateTree()
	{
		root = null;
	}

	/*
	 * Root/data Insertion Functions
	 */
	void insert(int data)
	{
		root = insertRec(root,data);

	}

	Node insertRec(Node root,int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}

		else if(data < root.data)
			root.left = insertRec(root.left,data);
		else
			root.right = insertRec(root.right,data);
		return root;
	}

	/*
	 *Root/Data Arranging Functions(Determining to add new root Either left or right side of main root) 
	 */
	void order()
	{
		orderRec(root);
	}

	void orderRec(Node root)
	{
		if(root == null)
			return;

		orderRec(root.left);
		System.out.print(root.data + " ");
		orderRec(root.right);
	}


	/*
	 * Driver/Main/Calling Function
	 */
	public static void main(String[] args)
	{
		CreateTree tree = new CreateTree();
		tree.insert(56);
		tree.order();
		System.out.println();
		tree.insert(30);
		tree.order();
		System.out.println();
		tree.insert(70);
		tree.order();
		System.out.println();
		tree.insert(22);
		tree.order();
		System.out.println();
		tree.insert(40);
		tree.order();
		System.out.println();
		tree.insert(11);
		tree.order();
		System.out.println();
		tree.insert(3);
		tree.order();
		System.out.println();
		tree.insert(16);
		tree.order();
		System.out.println();
		tree.insert(60);
		tree.order();
		System.out.println();
		tree.insert(95);
		tree.order();
		System.out.println();
		tree.insert(65);
		tree.order();
		System.out.println();
		tree.insert(63);
		tree.order();
		System.out.println();
		tree.insert(67);
		tree.order();
	}

}
