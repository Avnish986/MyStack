package com.data.structures;

public class MyHashMap<K,V> {
	MyLinkedList <K> mll;
	
	public MyHashMap() {
		this.mll = new MyLinkedList();
	}
	public static void main(String[] args) {
		

	}
	
	public V get(K key) {
		MapNode<K,V>  node = (MapNode<K,V>) this.mll.search1(key);
		return (node == null) ? null : node.getvalue();
		
	}
	public void add(K key, V val) {
		MapNode<K,V>  node = (MapNode<K,V>) this.mll.search1(key);
		if(node == null) {
			node = new MapNode<>(key,val);
			this.mll.addFront(node);
		}
		else {
			node.setValue(val);
		}
	}

	@Override 
	public String toString() {
		return "M{" +mll +'}';
	}

}
