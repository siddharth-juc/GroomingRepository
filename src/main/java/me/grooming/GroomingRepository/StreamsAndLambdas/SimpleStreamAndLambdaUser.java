package me.grooming.GroomingRepository.StreamsAndLambdas;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamAndLambdaUser {

	/*
	 * This encapsulates all the Stream methods that I know how to implement.
	 * 
	 */

	/*
	 * Filtering - Selecting certain elements from a List based on given condition.
	 * 
	 */
	public static void showEvenIntegersFromListOfGivenIntegers(List<Integer> givenIntegers) {

		System.out.println("List of Even Integers from given Series of Integers :: ");

		givenIntegers.stream().filter((integer) -> integer % 2 == 0).collect(Collectors.toList())
				.forEach((integer) -> System.out.println(integer));

	}

	/*
	 * Mapping - Modifying each element of List.
	 * 
	 */
	public static List<Integer> squareSeriesOfIntegers(List<Integer> givenIntegers) {

		return givenIntegers.stream().map(integer -> integer * integer).collect(Collectors.toList());

	}

	/*
	 * Reduction - Performing an Operation on all elements of List to yield a single
	 * output.
	 * 
	 */
	public static Integer findProductOfSeriesOfIntegers(List<Integer> givenSeriesOfIntegers) {

		return givenSeriesOfIntegers.stream().reduce(Integer.valueOf(1), (product, integer) -> {
			return Integer.valueOf(product * integer);
		});

	}

}