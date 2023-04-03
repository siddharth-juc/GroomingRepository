package me.grooming.GroomingRepository.StringWorks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LongestDictionaryWordIncrementalFinder {
	
	public static String findLongestDictionaryWordBuiltIncrementally(String[] givenDictionarySequences) {
		
		Set<String> setOfWords = new HashSet<>();
		
		for(String word : givenDictionarySequences)
			setOfWords.add(word);
		
		Queue<String> wordQueue = new LinkedList<>();
		
		String longestWordTillNow = "";
		wordQueue.add(longestWordTillNow);
		
		while(!wordQueue.isEmpty()) {
			
			String sequence = wordQueue.poll();
			longestWordTillNow = sequence;
			
			for(int i = 25; i >= 0; i--) {
				
				String incrementedSequence = sequence + String.valueOf((char) ('a' + i));
				
				if(setOfWords.contains(incrementedSequence)) 
					wordQueue.add(incrementedSequence);
				
			}
			
		}
		
		return longestWordTillNow;
		
	}

}