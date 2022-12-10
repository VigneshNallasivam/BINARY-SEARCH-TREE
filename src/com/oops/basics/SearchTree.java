package com.oops.basics;

import com.oops.basics.CreateTree.Node;

public class SearchTree 
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
	SearchTree()
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
	 * Function for Searching the Node in a Tree
	 */
	public boolean search(Node root, int input)
	{
		if(root == null)
		{
			return false;
		}

		if(root.data == input)
		{
			return true;
		}

		boolean result1 = search(root.left,input);
		if(result1 == true)
			return true;

		boolean result2 = search(root.right,input);
		return result2;

	}


	/*
	 * Driver/Main/Calling Function
	 */
	public static void main(String[] args)
	{
		SearchTree tree = new SearchTree();
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
		System.out.println();
		if(tree.search(tree.root, 63)!= false )
		{
			System.out.println("63 is present");
		}
		else
			System.out.println("63 is not  present");
	}


}
