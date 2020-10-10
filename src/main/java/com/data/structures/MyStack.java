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

	public INode peek() {
		return mll.head;
	}

	public INode pop() {
		return mll.pop();
	}

	public static void main(String[] args) {

	}

}
