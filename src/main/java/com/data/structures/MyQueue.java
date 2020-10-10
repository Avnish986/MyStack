package com.data.structures;

public class MyQueue {
	private final MyLinkedList mll;

	public MyQueue() {
		this.mll = new MyLinkedList();
	}

	public void enqueue(INode node) {
		mll.addFront(node);
	}

	public void print() {
		mll.print();
	}
}
