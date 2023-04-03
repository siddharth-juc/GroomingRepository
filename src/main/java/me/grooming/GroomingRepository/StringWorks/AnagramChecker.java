package me.grooming.GroomingRepository.StringWorks;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

	public static boolean isAnagram(String firstWord, String secondWord) {

		if (firstWord.length() != secondWord.length())
			return false;

		Map<Character, Integer> charFrequency = new HashMap<Character, Integer>();

		for (int i = 0; i < firstWord.length(); i++) {

			charFrequency.put(firstWord.charAt(i), charFrequency.getOrDefault(firstWord, 0) + 1);

		}

		for (int i = 0; i < secondWord.length(); i++) {

			if (!charFrequency.containsKey(secondWord.charAt(i)))
				return false;

			charFrequency.put(secondWord.charAt(i), charFrequency.get(secondWord.charAt(i)) - 1);

		}

		for (int i = 0; i < firstWord.length(); i++) {

			if (charFrequency.get(firstWord.charAt(i)) != 0)
				return false;

		}

		return true;

	}

}
