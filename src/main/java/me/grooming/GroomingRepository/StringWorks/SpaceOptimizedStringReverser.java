package me.grooming.GroomingRepository.StringWorks;

public class SpaceOptimizedStringReverser {

	private static String reverseStringThroughCharArray(char[] charArray) {

		int fromFirst = 0, fromLast = charArray.length - 1;

		while (fromFirst < fromLast) {

			charArray[fromFirst] ^= charArray[fromLast];
			charArray[fromLast] ^= charArray[fromFirst];
			charArray[fromFirst] ^= charArray[fromLast];

			fromFirst++;
			fromLast--;

		}

		return String.valueOf(charArray);

	}

	public static String reverseString(String words) {

		return reverseStringThroughCharArray(words.toCharArray());

	}

}
