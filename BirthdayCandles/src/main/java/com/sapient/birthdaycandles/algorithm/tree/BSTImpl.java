package com.sapient.birthdaycandles.algorithm.tree;

public class BSTImpl implements BinarySearchTree {



/*
 * Complexity O(LogN)
 */
	
	private static int count=0;
	public BSTNode insertIntoTree(BSTNode root, int input) {

		if(input < 0) {
			throw new IllegalArgumentException("negative integers not supported");
		}

		if(root == null) {
			count++;
			return new BSTNode(input);
		}

		if(input == root.getData()) {
			return root;
		}else if (input <  root.getData()) {
			root.setLeft(insertIntoTree(root.getLeft(), input));
		}else if (input >  root.getData()) {
			root.setRight(insertIntoTree(root.getRight(), input));
		}
		return root;
	}

	public int countNodes(BSTNode root) {
    //		return inorderTraversal(root);
		return count;
	}
	
	private int inorderTraversal(BSTNode root) {
		int countLeft =0;
		int countRight =0;
		if(root == null) {
			return 0;
		}
		countLeft = inorderTraversal(root.getLeft());
		countRight= inorderTraversal(root.getRight());
		return countLeft+countRight+1;
		
	}


}
