package com.oops.basics;

public class CreateNodes
{
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

	Node root;
	CreateNodes()
	{
		root = null;
	}

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
