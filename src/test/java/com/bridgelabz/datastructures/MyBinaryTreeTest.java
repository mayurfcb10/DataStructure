package com.bridgelabz.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
	/* Created Binary Tree */
	@Test
	public void given3NumbersWhenAddedToABinarySearchTreeShouldReturn3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}