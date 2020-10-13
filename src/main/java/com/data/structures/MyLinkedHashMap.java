package com.data.structures;

import java.util.ArrayList;

public class MyLinkedHashMap<K,V> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;
	
	public MyLinkedHashMap() {
		this.numBuckets=10;
		this.myBucketArray=new ArrayList<>(numBuckets);
		//create empty linkedList
		for(int i=0;i<numBuckets;i++) {
			this.myBucketArray.add(null);
		}
	}
	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index=hashCode%numBuckets;
		System.out.println("Key: "+key+" hashcode: "+hashCode+" index: "+index);
		return index;
	}
	
	public V get(K key) {
		int index=this.getBucketIndex(key);
		MyLinkedList<K> mll = this.myBucketArray.get(index);
		if(mll == null) return null;
		MapNode<K,V> node = (MapNode<K,V>)mll.search1(key);
		return (node == null)? null : node.getvalue();
		
	}
	public void add(K key, V val) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> mll = this.myBucketArray.get(index);
		if(mll == null) {
			mll = new MyLinkedList<>();
			this.myBucketArray.set(index, mll);
		}
		MapNode<K,V> node = (MapNode<K,V>)mll.search1(key);
		if(node==null) {
			node = new MapNode<>(key,val);
			mll.addFront(node);
		}
		else {
			node.setValue(val);
		}
		
	}
	public void remove(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> mll = this.myBucketArray.get(index);
		if(mll == null) {
			System.out.println("no such key to remove");
		}
		else {		
				mll.delete1(key);
		}
	}
	@Override
	public String toString() {
		return "H{" +myBucketArray +'}';
	}

}
