package Comp282Project3;

public class TreeNode {

	// Give the node some data fields we will need in our tree
	TreeNode leftChild;
	TreeNode rightChild;
	TreeNode parent;
	int data;
	Edge ed;

	int color = 0;

	public TreeNode(int D, TreeNode left, TreeNode right) {
		leftChild = left;
		rightChild = right;
		data = D;
		color = 0;
	}

	public TreeNode(int D) {
		this(D, null, null);
	}
}
