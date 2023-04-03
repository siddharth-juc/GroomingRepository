package me.grooming.GroomingRepository.StringWorks;

import java.util.List;

public class LongestCommonPrefixFinder {
	
	private static final int ALPHABET_SIZE = 26;
	
	private static class TrieNode {
		
		TrieNode[] branchingNodes = new TrieNode[ALPHABET_SIZE];
		
		boolean isLeaf;
		
		public TrieNode() {
			
			for (int i = 0; i < ALPHABET_SIZE; i++)
				
				branchingNodes[i] = null;
			
			isLeaf = false;
			
		}
		
	};
	
	private static TrieNode root;
	
	private static int indexes;
	
	private static void insertString (String givenString) {
		
		int characterIndex;
		
		TrieNode currentNode = root;
		
		for (int i = 0; i < givenString.length(); i++) {
			
			characterIndex = givenString.charAt(i) - 'a';
			
			if(currentNode.branchingNodes[characterIndex] == null)
				
				currentNode.branchingNodes[characterIndex] = new TrieNode();
			
			currentNode = currentNode.branchingNodes[characterIndex];
			
		}
		
		currentNode.isLeaf = true;
		
	}
	
	private static int getNumberOfBranches (TrieNode givenNode) {
		
		int numberOfBranches = 0;
		
		for (int i = 0; i < ALPHABET_SIZE; i++) {
			
			if (givenNode.branchingNodes[i] != null) {
				
				numberOfBranches ++;
				indexes = i;
				
			}
			
		}
		
		return numberOfBranches;
		
	}
	
	private static String climbUpTheTrie () {
		
		TrieNode currentNode = root;
		indexes = 0;
		
		String prefixTillTheTrunk = "";
		
		while ((currentNode.isLeaf == false) 
				&& (getNumberOfBranches(currentNode) == 1)) {
			
			currentNode = currentNode.branchingNodes[indexes];
			
			prefixTillTheTrunk += (char) ('a' + indexes);
			
		}
		
		return prefixTillTheTrunk;
		
	}
	
	private static void plantTrie (List<String> givenStrings) {
		
		for (String givenString : givenStrings)
			
			insertString(givenString);
		
	}
 	
	public static String getLongestCommonPrefix (List<String> givenListOfStrings) {
		
		root = new TrieNode();
		
		plantTrie(givenListOfStrings);
		return climbUpTheTrie();
		
	}

}
