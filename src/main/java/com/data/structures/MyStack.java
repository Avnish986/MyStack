package com.data.structures;


public class MyStack {

	private final MyLinkedList mll;

	public MyStack() {
		this.mll = new MyLinkedList();
	}

	public void push(INode node) {
		mll.addEnd(node);
	}

	public void print() {
		mll.print();
	}

	public static void main(String[] args) {

	}

}
