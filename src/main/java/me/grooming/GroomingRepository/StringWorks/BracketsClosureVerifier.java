package me.grooming.GroomingRepository.StringWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsClosureVerifier {

	public static boolean isSequenceOfBracketsCompletelyClosedAndHenceValid(String sequenceOfBrackets) {

		if (sequenceOfBrackets.isBlank())
			return false;

		Map<Character, Character> correspondingOpeningBracket = new HashMap<>();

		correspondingOpeningBracket.put(')', '(');
		correspondingOpeningBracket.put('}', '{');
		correspondingOpeningBracket.put(']', '[');

		Stack<Character> bracketStack = new Stack<>();

		for (int i = 0; i < sequenceOfBrackets.length(); i++) {

			if ((sequenceOfBrackets.charAt(i) == '(') || (sequenceOfBrackets.charAt(i) == '{')
					|| (sequenceOfBrackets.charAt(i) == '[')) {

				bracketStack.push(sequenceOfBrackets.charAt(i));
				continue;

			}

			if ((bracketStack.size() == 0)
					|| (correspondingOpeningBracket.get(sequenceOfBrackets.charAt(i)) != bracketStack.pop()))
				return false;

		}

		if (bracketStack.empty())
			return true;

		else
			return false;

	}

}