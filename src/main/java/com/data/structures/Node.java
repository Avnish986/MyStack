package com.data.structures;


public class Node<K> implements INode<K> {
	private INode next;
	private K key;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public INode<K> getNext() {
		return next;
	}

	@Override
	public K getKey() {

		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;

	}

	@Override
	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return (this.getKey() + "");
	}

	public static void main(String[] args) {

	}

}
