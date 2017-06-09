package Comp282Project3;

public class MST {
		static TreeNode root;
		
		public void insert(int data) {
			//A normal binary search tree insert but adjustment calls when finally inserting
			TreeNode newNode = new TreeNode(data);
			if (root == null) {

				newNode.parent = null;
				root = newNode;		
				return;	
			}
			
			TreeNode current = root;
			TreeNode parent = null;

			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						newNode.parent = parent;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						newNode.parent = parent;
						return;
					}
				}
			}
		}

		

		
		public boolean find(int data) {
			TreeNode current = root;
			TreeNode parent = null;

			
			while (current.data != data) {
				parent = current;
				if (data > current.data) {
					current = current.rightChild;
					
				} else {
					current = current.leftChild;
			
				}
				if (current == null) {
					System.out.println("Whoops");
					return false;
				}
			}
			return true;
		}

		public void inOrderPrint(TreeNode nd) {

			//Print all the tree values in order followed by their color

			if (nd == null) {
				return;	
			}

			inOrderPrint(nd.leftChild);
			
			System.out.print(nd.data + "/" + " ");

			inOrderPrint(nd.rightChild);
			
		}

		
		public void postOrderPrint(TreeNode nd) {

			if (nd == null) {		
				return;
	
			}
			
			postOrderPrint(nd.leftChild);
			postOrderPrint(nd.rightChild);
			System.out.print(nd.data + "/" +  " ");
		}

		
		public void preOrderPrint(TreeNode nd) {

			if (nd == null) {
				return;	
			}

			System.out.print(nd.data + "/" +  " ");
			preOrderPrint(nd.leftChild);
			preOrderPrint(nd.rightChild);
		}

		
		

		public void displayTree(TreeNode root, String indent) {
			//Draw the tree by adding onto the same string
			if (root == null) {

				System.out.println(indent + "null");

				return;
			
			}
			String newIndent;
			newIndent = "---" + indent;
			displayTree(root.leftChild, newIndent);
			System.out.println(indent + root.data );
			displayTree(root.rightChild, newIndent);
			
		}

	}


