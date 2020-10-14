package com.data.structures;

public class MyBinaryTree <K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;
	public void add(K key) {
		this.root=this.addRecursively(root,key);
	}
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> curr, K key){
		if(curr == null)
			return new MyBinaryNode<>(key);
		
		int res = key.compareTo(curr.key);
		if(res == 0) {
			return root;
		}
		if(res<0) {
			curr.left = addRecursively(curr.left, key);
		}
		else {
			curr.right = addRecursively(curr.right, key);
		}
		return curr;
		
	}
	public int getSize() {
		return this.getSizeRecursively(root);
	}
	private int getSizeRecursively(MyBinaryNode<K> curr) {
		// TODO Auto-generated method stub
		return curr == null ? 0: 1+ this.getSizeRecursively(curr.left)+this.getSizeRecursively(curr.right);
	}
	public boolean search(K key) {
		return this.searchRecursive(root,key);
	}
	private boolean searchRecursive(MyBinaryNode<K> root, K key) {
		if (root == null) {
			return false;
		}
		int compared = root.key.compareTo(key);
		if (compared == 0)
			return true;
		else if (compared < 0)
			return searchRecursive(root.right, key);
		else
			return searchRecursive(root.left, key);
	}

	
}
