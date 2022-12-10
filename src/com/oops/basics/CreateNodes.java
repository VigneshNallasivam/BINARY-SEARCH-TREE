package com.oops.basics;

public class CreateNodes
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
	CreateNodes()
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
		CreateNodes tree = new CreateNodes();
		tree.insert(56);
		tree.order();
		System.out.println();
		tree.insert(30);
		tree.order();
		System.out.println();
		tree.insert(70);
		tree.order();
	}

}
