package me.grooming.GroomingRepository.StringWorks;

public class LongestNonRepeatingSubstringLengthFinder {
	
	public static int findLengthOfLongestNonRepeatingSubstring(String givenString) {
		
		if(givenString.isEmpty())
			return 0;
		
		else if(givenString.length() == 1)
			return 1;
		
		String subStringWindow = "";
		int maximumLengthTillNow = -1;
		
		for(char eachCharacter : givenString.toCharArray()) {
			
			if(subStringWindow.contains(String.valueOf(eachCharacter))) 
				subStringWindow = subStringWindow.substring(subStringWindow.indexOf(eachCharacter) + 1);
			
			subStringWindow += String.valueOf(eachCharacter);
			
			maximumLengthTillNow = Math.max(subStringWindow.length(), maximumLengthTillNow);
			
		}
		
		return maximumLengthTillNow;
		
	}

}