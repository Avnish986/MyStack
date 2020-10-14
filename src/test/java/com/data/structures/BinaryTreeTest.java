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
}
