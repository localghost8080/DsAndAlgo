package com.sapient.birthdaycandles.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sapient.birthdaycandles.algorithm.tree.BSTImpl;
import com.sapient.birthdaycandles.algorithm.tree.BSTNode;

public class BSTImplTest {

	BSTImpl bstImpl = new BSTImpl();
	
	@Test
	public void insertIntoTree() {
		int[] testData = {12,5,7,1,6};
		BSTNode node = null; 
		
		for(int val : testData) {
			node = bstImpl.insertIntoTree(node, val);
		}
		
		assertEquals(12, node.getData());
		assertEquals(5, node.getLeft().getData());
		assertEquals(1, node.getLeft().getLeft().getData());
		assertEquals(7, node.getLeft().getRight().getData());
		assertEquals(6, node.getLeft().getRight().getLeft().getData());
		
	}
	
	@Test
	public void insertIntoTreeDuplicate() {
		int[] testData = {8, 7, 7, 5, 3, 8, 8, 3, 5, 3, 7};
		BSTNode node = null; 
		
		for(int val : testData) {
			node = bstImpl.insertIntoTree(node, val);
		}
		
		int count = bstImpl.countNodes(node);
		assertEquals(4, count);
		
	}

}
