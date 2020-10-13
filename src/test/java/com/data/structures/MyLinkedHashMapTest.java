package com.data.structures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnParanoidFrequecy() {
		String sen = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> map = new MyLinkedHashMap<>();
		String[] words = sen.toLowerCase().split(" ");
		for (String word : words) {
			Integer val = (Integer) map.get(word);
			if (val == null)
				val = 1;
			else
				val += 1;
			map.add(word, val);
		}
		int freq = map.get("paranoid");
		System.out.println(map);
		Assert.assertEquals(3, freq);
	}
}
