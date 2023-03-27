package me.grooming.GroomingRepository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import me.grooming.GroomingRepository.AutoBoxingUnBoxing.AutoBoxUnBox;
import me.grooming.GroomingRepository.ComparisonInterfacesImplementations.CuisineDish;
import me.grooming.GroomingRepository.ComparisonInterfacesImplementations.DishSorterByName;
import me.grooming.GroomingRepository.EnumsWork.Cantonments;
import me.grooming.GroomingRepository.ImmutableClassWorks.LibraryICard;
import me.grooming.GroomingRepository.POJOWorks.Book;
import me.grooming.GroomingRepository.PolymorphismVisiblility.MathematicsStudent;
import me.grooming.GroomingRepository.PolymorphismVisiblility.UniversityStudent;
import me.grooming.GroomingRepository.StringWorks.AnagramChecker;
import me.grooming.GroomingRepository.StringWorks.BiCharacterPalindromeSubsequencesRemover;
import me.grooming.GroomingRepository.StringWorks.MatchingSubsequencesCounter;
import me.grooming.GroomingRepository.StringWorks.PalindromeChecker;
import me.grooming.GroomingRepository.StringWorks.SpaceOptimizedStringReverser;
import me.grooming.GroomingRepository.StringWorks.VowelStringsCounter;

public class App {

	public static void main(String[] args) {

		UniversityStudent universityStudent = new UniversityStudent();
		universityStudent.setStudentRoll("327X6119922");
		universityStudent.setStudentName("Siddharth J. ");
		universityStudent.setStudentGender("Male");
		universityStudent.setStudentMobileNumber("+918897565485");

		/*
		 * This calls printStudentDetails() defined in UniversityStudent -> the base
		 * class
		 */
		universityStudent.printStudentDetails();

		MathematicsStudent mathematicsStudent = new MathematicsStudent();
		mathematicsStudent.setStudentRoll("327X6119922");
		mathematicsStudent.setStudentName("Siddharth J. ");
		mathematicsStudent.setStudentGender("Male");

		/*
		 * This calls assignProject with 3 arguments defined in MathematicsStudent
		 */
		mathematicsStudent.assignProject("Cosmology", "Study", "Dr. P. K. S. ");

		/*
		 * This calls printStudentDetails() defined in MathematicsStudent -> the derived
		 * class printStudentDetails() in derived class overrides the method in base
		 * class. The object of derived class implements the method defined by the
		 * derived class itself while the base class method implementation is hidden.
		 */
		mathematicsStudent.printStudentDetails();

		/*
		 * This calls assignProject with 4 arguments defined in MathematicsStudent
		 */
		mathematicsStudent.assignProject("Cosmology", "Study", "Dr. P. K. S. ", "Gaurav G. ");
		mathematicsStudent.printStudentDetails();

		/*
		 * Showing the usage of an Enum with multiple arguments and a private
		 * constructor
		 */
		Cantonments cbank = Cantonments.PATHANKOT;
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("Right now at  		=====> " + cbank.getFullName());
		System.out.println("With Station Code 	=====> " + cbank.getStationCode());
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		AutoBoxUnBox autoBoxUnBox = new AutoBoxUnBox();
		autoBoxUnBox.autoBox();
		autoBoxUnBox.unBox();
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		/*
		 * Let's see the String Works
		 */
		String anagramCheck01 = "listen";
		String anagramCheck02 = "silent";
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("First Word  		=====> " + anagramCheck01);
		System.out.println("Second Word		 	=====> " + anagramCheck02);
		System.out.println("Are they Anagrams?  =====> " + AnagramChecker.isAnagram(anagramCheck01, anagramCheck02));
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		String palindromeCheck01 = "Ma'am";
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("Given Word  		=====> " + palindromeCheck01);
		System.out.println("Is it Palindrome?   =====> " + PalindromeChecker.isPalindrome(palindromeCheck01));
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		String reverserCheck01 = "Bestfriend";
		System.out.println();
		System.out.println("Given Word  		=====> " + reverserCheck01);
		System.out.println("Reversed Word       =====> " + SpaceOptimizedStringReverser.reverseString(reverserCheck01));
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		String givenSequence = "girls";
		String[] givenSubsequences = { "g", "gir", "irl", "girls", "rils" };
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("Given Sequence  	=====> " + givenSequence);
		System.out.println("Given Subsequences	=====> " + givenSubsequences.toString());
		System.out.println("Matching Subsequences \n" + "in Number  			=====> "
				+ MatchingSubsequencesCounter.countMatchingSubsequencesinSequence(givenSequence, givenSubsequences));
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		String[] givenStrings = { "ambala", "hyderabad", "Agartala", "amravati", "erode", "udhampur", "leh" };
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("Given Strings  		=====> " + givenStrings.toString());
		System.out.println(
				"Count of \n" + "Vowel Strings       =====> " + VowelStringsCounter.countVowelStrings(givenStrings));
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		String palindromeSequenceClearCheck01 = "aabbaaabbbaa";
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("Given Word  		=====> " + palindromeSequenceClearCheck01);
		System.out.println("Iterations to \n" + "clear the Word \n" + "by Palindromes      =====> "
				+ BiCharacterPalindromeSubsequencesRemover
						.getMinimumIterationsToClearStringByRemovingPalindromicSubsequences(
								palindromeSequenceClearCheck01));
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		/*
		 * Now checking the POJO equals() & hashCode() method
		 */

		Book firstBook = new Book("Mathematics", "Thomas' Calculus", "9789353060411");
		Book nextBook = new Book("Mathematics", "Thomas' Calculus", "9789353060411");
		Book stillNextBook = new Book("Higher Mathematics", "Thomas' Calculus", "9789353060411");
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("First Book  		=====> " + firstBook.toString());
		System.out.println("Second Book		 	=====> " + nextBook.toString());
		System.out.println("Are they the Same?  =====> " + firstBook.equals(nextBook));
		System.out.println();
		System.out.println("Still another Book  =====> " + stillNextBook.toString());
		System.out.println("Is it the Same?     =====> " + stillNextBook.equals(nextBook));
		System.out.println();
		System.out.println("Above Book's Hash  	=====> " + stillNextBook.hashCode());
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		/*
		 * Checking the Comparison Interfaces' Implementation
		 */
		List<CuisineDish> listOfDishes = new ArrayList<CuisineDish>();
		listOfDishes.add(new CuisineDish("Mysore Dosa", "South Indian", 250));
		listOfDishes.add(new CuisineDish("Hyderabadi Biryani", "South Indian", 200));
		listOfDishes.add(new CuisineDish("Manchow Soup", "Indo-Chinese", 150));
		listOfDishes.add(new CuisineDish("Stuffed Kulcha", "Punjabi", 120));
		listOfDishes.add(new CuisineDish("Amdo Thukpa", "Indo-Tibetan", 240));
		DishSorterByName dishSorterByName = new DishSorterByName();
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		Collections.sort(listOfDishes);
		/*
		 * Here, the dishes will be sorted usingf the compareTo() method in the
		 * Comparable interface, this means the compareTo() method sorts the list as per
		 * the natural order defined by us, here in the order of priceForOne.
		 */
		System.out.println("Dishes Sorted\n" + "Naturally  			=====> " + listOfDishes.toString());
		
		Collections.sort(listOfDishes, dishSorterByName);
		/*
		 * Here, the compare() method is used, from Comparator interface, thus we have
		 * explicitly mentioned the object where the comparison method is implemented,
		 * this way we can sort the Collection according to something not by natural
		 * order, e. g. by the name of the dish here.
		 */
		System.out.println("By Name			 	=====> " + listOfDishes.toString());
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		/*
		 * Using an Object of Immutable Class
		 */
		List<String> departments = new ArrayList<String>();
		departments.add("Natural Sciences");
		departments.add("Applied Sciences");
		departments.add("Linguistics & Phonetics");
		Instant instant = Instant.now();
		Date updatedDate = Date.from(instant);
		LibraryICard libraryICard = new LibraryICard("Siddharth J.", "327X6119922", departments, updatedDate);
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("Library Identification Card");
		System.out.println("Member Name				=====> " + libraryICard.getName());
		System.out.println("Identification Number	=====> " + libraryICard.getIdentificationNumber());
		System.out.println("Departments List		=====> " + libraryICard.getDepartments().toString());
		System.out.println("Date of Enrollment		=====> " + libraryICard.getDateOfEnrollment().toString());
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

	}

}
