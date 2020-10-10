package com.data.structures;



public interface INode<K> {
	K getKey();

	void setKey(K key);

	INode getNext();

	void setNext(INode next);

}
