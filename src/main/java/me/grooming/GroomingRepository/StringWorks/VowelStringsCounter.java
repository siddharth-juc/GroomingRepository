package me.grooming.GroomingRepository.StringWorks;

import java.util.HashSet;
import java.util.Set;

public class VowelStringsCounter {

	public static int countVowelStrings(String[] words) {

		int countOfVowelStrings = 0;

		Set<Character> setOfVowels = new HashSet<Character>();
		setOfVowels.add('A');
		setOfVowels.add('a');
		setOfVowels.add('E');
		setOfVowels.add('e');
		setOfVowels.add('I');
		setOfVowels.add('i');
		setOfVowels.add('O');
		setOfVowels.add('o');
		setOfVowels.add('U');
		setOfVowels.add('u');

		for (String word : words) {

			if (setOfVowels.contains(word.charAt(0)) && setOfVowels.contains(word.charAt(word.length() - 1)))
				countOfVowelStrings++;

		}

		return countOfVowelStrings;

	}

}