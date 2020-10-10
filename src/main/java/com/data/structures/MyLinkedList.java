package com.data.structures;



public class MyLinkedList<E> {
	INode head;
	INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addEnd(INode node) {
		if (head == null) {
			this.head = node;
			this.tail = node;
		} else {
			node.setNext(head);
			this.head = node;
		}

	}

	public void addFront(INode node) {
		if (head == null) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = tail.getNext();
		}

	}

	public int len() {
		INode temp = head;
		int cnt = 0;
		while (temp != null) {
			cnt++;
			temp = temp.getNext();
		}
		return cnt;
	}

	public void middle(INode node) {
		if (head == null) {
			this.head = node;
			this.tail = node;
			return;
		}
		int length = len() / 2;
		INode temp = head;
		INode temp2 = head.getNext();

		while (temp2 != null && temp2.getNext() != null) {
			temp = temp.getNext();
			temp2 = temp2.getNext().getNext();
		}
		INode temp3 = temp.getNext();
		temp.setNext(node);
		node.setNext(temp3);

	}

	public INode pop() {
		INode temp = head;
		head = head.getNext();
		return temp;
	}

	public INode popLast() {
		INode temp = tail;
		INode temp2 = head;
		while (temp2.getNext() != temp) {
			temp2 = temp2.getNext();
		}
		temp2.setNext(null);
		tail = temp2;
		return temp;

	}

	public int search(Integer key) {
		int l = len();
		if (head == null) {
			return -1;
		} else {
			INode temp = head;
			int cnt = 0;
			while (temp != null) {
				if (temp.getKey() == key) {
					System.out.println(key + " Fount at " + cnt);
					return cnt;
				}
				cnt++;
				temp = temp.getNext();
			}

		}
		return -2;
	}

	public void insert(INode node, Integer key) {
		if (head == null) {
			return;
		}
		int pos = search(key);
		if (pos >= 0) {
			INode temp = head;
			while (temp != null) {
				if (pos == 0) {
					INode temp3 = temp.getNext();
					temp.setNext(node);
					node.setNext(temp3);
				}
				temp = temp.getNext();
				pos--;
			}
		} else {
			System.out.println("Not such key");
			return;
		}
	}

	public void delete(Integer key) {
		if (head == null) {
			return;
		}
		int pos = search(key);
		if (pos >= 0) {
			INode temp = head;
			INode temp2 = head.getNext();
			while (temp2 != null) {
				temp2 = temp2.getNext();
				if (pos == 1) {
					INode temp3 = temp.getNext();
					temp.setNext(temp2);
					return;
				}
				temp = temp.getNext();
				pos--;
			}
		} else {
			System.out.println("No such key in linked list");
			return;
		}
	}

	public void print() {
		INode temp = head;
		while (temp != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.println("");
	}

}
