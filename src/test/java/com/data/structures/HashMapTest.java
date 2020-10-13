package com.data.structures;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
public class HashMapTest {
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequecy() {
		String sen = "To be or not to be";
		MyHashMap<String,Integer> map = new MyHashMap<>();
		String[] words = sen.toLowerCase().split(" ");
		for(String word:words) {
			Integer val = (Integer) map.get(word);
			if(val == null) val=1;
			else val+=1;
			map.add(word,val);
		}
		int freq = map.get("to");
		System.out.println(map);
		Assert.assertEquals(2, freq);
	}
}
