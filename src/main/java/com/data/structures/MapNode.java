package com.data.structures;

public class MapNode<K,V> implements INode {
	K key;
	V value;
	MapNode<K,V> next;
	
	public MapNode(K key, V value) {
		this.key=key;
		this.value=value;
		next=null;
	}
	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(Object key) {
		// TODO Auto-generated method stub
		this.key=(K) key;
	}

	@Override
	public INode getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	
	public V getvalue() {
		return this.value;
	}
	public void setValue(V value) {
		this.value=value;
	}

	@Override
	public void setNext(INode next) {
		// TODO Auto-generated method stub
		this.next=(MapNode<K,V>) next;
	}
	@Override
	public String toString() {
		StringBuilder myMapString = new StringBuilder();
		myMapString.append("MapNode{" + "K=").append(key).append(" V=").append(value).append('}');
		
		if(next!=null)
			myMapString.append("->").append(next);
		
		return myMapString.toString();
	}
	
}
