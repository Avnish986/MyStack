package com.data.structures;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
	@Test
	public void given3Numbers_WhenAdded_BinaryTreeShouldReturnSizeThree() {
		MyBinaryTree tree = new MyBinaryTree();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		int s = tree.getSize();
		Assert.assertEquals(3, s);
	}
	@Test
	public void given13Numbers_WhenAdded_BinaryTreeShouldReturnSize13() {
		MyBinaryTree tree = new MyBinaryTree();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		tree.add(60);
		tree.add(95);
		tree.add(65);
		tree.add(63);
		tree.add(67);
		tree.add(22);
		tree.add(40);
		tree.add(11);
		tree.add(3);
		tree.add(16);

		int s = tree.getSize();
		Assert.assertEquals(13, s);
	}
}
