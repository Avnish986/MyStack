package com.data.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {
	@Test
	public void given3NumberWhenAddedToQueueShouldBeAddedFromFront() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyQueue queue = new MyQueue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.print();

	}
}
