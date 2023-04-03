package me.grooming.GroomingRepository.StringWorks;

public class BiCharacterPalindromeSubsequencesRemover {

	public static int getMinimumIterationsToClearStringByRemovingPalindromicSubsequences(String charSequence) {

		if (charSequence.isEmpty())
			return 0;

		if (PalindromeChecker.isPalindrome(charSequence))
			return 1;

		return 2;

	}

}
