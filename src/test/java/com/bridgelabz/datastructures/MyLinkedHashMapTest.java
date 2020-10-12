package com.bridgelabz.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {
	/* find frequency */
	@Test
	public void givenALargeSentenceWhenWordsAreAddedToListShouldReturnParanoidWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but"
						  + " because they keep putting themselves deliberately into paranoid "
						  + "avoidable situations";
		MyLinkedHashMap<String, Integer> myHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("paranoid");
		System.out.println(myHashMap);
		Assert.assertEquals(3, frequency);

	}
	
	
	

}
