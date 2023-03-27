package me.grooming.GroomingRepository.StringWorks;

import java.util.HashMap;
import java.util.Map;

public class MatchingSubsequencesCounter {

	public static int countMatchingSubsequencesinSequence (String givenSequence, String[] subsequences) {
		
		int countOfMatchingSubsequences = 0;
		
		Map<String, Integer> subsequencesFrequency = new HashMap<String, Integer> ();
		
		for(String subsequence : subsequences) {
			
			subsequencesFrequency.put(subsequence, 
					subsequencesFrequency.getOrDefault(subsequence, 0) + 1);
			
		}
		
		for(String subsequence : subsequencesFrequency.keySet()) {
			
			int sequencePointer = 0, subsequencePointer = 0;
			
			while((sequencePointer < givenSequence.length()) && (subsequencePointer < subsequence.length())) {
				
				if(givenSequence.charAt(sequencePointer) == subsequence.charAt(subsequencePointer))
					subsequencePointer ++;
				
				if(subsequencePointer == subsequence.length())
					break;
				
				sequencePointer++;
				
			}
			
			if(subsequencePointer == subsequence.length())
				countOfMatchingSubsequences += subsequencesFrequency.get(subsequence);
			
		}
		
		return countOfMatchingSubsequences;
		
	}

}