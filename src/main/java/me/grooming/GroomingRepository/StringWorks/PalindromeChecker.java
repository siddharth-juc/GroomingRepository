package me.grooming.GroomingRepository.StringWorks;

public class PalindromeChecker {

	public static boolean isPalindrome(String words) {

		int fromFirst = 0, fromLast = words.length() - 1;

		while (fromFirst <= fromLast) {

			if ((words.charAt(fromFirst) != words.charAt(fromLast))
					&& (words.charAt(fromFirst) != words.charAt(fromLast) + 32)
					&& (words.charAt(fromFirst) != words.charAt(fromLast) - 32))
				return false;

			fromFirst++;
			fromLast--;

		}

		return true;

	}

}