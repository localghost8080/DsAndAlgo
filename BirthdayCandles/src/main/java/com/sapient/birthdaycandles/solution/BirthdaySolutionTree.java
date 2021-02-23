package com.sapient.birthdaycandles.solution;

import com.sapient.birthdaycandles.algorithm.tree.BSTImpl;
import com.sapient.birthdaycandles.algorithm.tree.BSTNode;
import com.sapient.birthdaycandles.algorithm.tree.BinarySearchTree;

public class BirthdaySolutionTree implements BirthdaySolution {

	BinarySearchTree bstImpl = new BSTImpl();
	
	/**
	 * Approach : create a binary search tree but dont insert duplicate nodes . 
	 * 
	 * Use inorder traveral while counting nodes to get unique nodes.
	 * 
	 * Complexity O(nlogn)
	 */
	
	public int getNumberOfBlows(int[] candles) {
		if(candles == null || candles.length ==0) {
			return 0;
		}
		BSTNode root = null; 
		for(int val : candles) {
			root = bstImpl.insertIntoTree(root, val);
		}
		
		return bstImpl.countNodes(root);
	}

}
