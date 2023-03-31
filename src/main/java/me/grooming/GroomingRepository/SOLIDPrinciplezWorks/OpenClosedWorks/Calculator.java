package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.OpenClosedWorks;

import java.util.Map;

public class Calculator {

	/*
	 * We don't implement all the operations here (implement all operations =>
	 * hard-code as a novice student would do) like the one below and expose it for
	 * modification.
	 * 
	 * Let's continue this discussion in the interface code comments.
	 */

	/*
	 * public double executeAddition(double firstNumber, double secondNumber) {
	 * 
	 * }
	 * 
	 * public double executeSubtraction(double firstNumber, double secondNumber) {
	 * 
	 * }
	 * 
	 * public double executeMultiplication(double firstNumber, double secondNumber)
	 * {
	 * 
	 * }
	 * 
	 * public double executeDivision(double firstNumber, double secondNumber) {
	 * 
	 * }
	 * 
	 * public double executeExponentiation(double firstNumber, double secondNumber)
	 * {
	 * 
	 * }
	 * 
	 * . . . . .
	 */

	/*
	 * Calculator class can have a map of different operations available which can
	 * be engaged as and when needed by creaating a new class to implement binary
	 * operation needed at that time, or disengaged, by removing the operation from
	 * the map.
	 */

	private Map<String, BinaryOperation> operationsAvailable;

	private double answer;

	public void calculateValue(String binaryOperationSymbol, double firstNumber, double secondNumber) {

		if (operationsAvailable.containsKey(binaryOperationSymbol))
			answer = operationsAvailable.get(binaryOperationSymbol).execute(firstNumber, secondNumber);

		else
			System.out.println("Sorry!! The Binary Operation is disengaged and hence, FORBIDDEN !!");

	}

	public void writeAnswer() {

		System.out.println("Answer =====> " + answer);

	}

	public void introduceNewBinaryOperation(String binaryOperationSymbol, BinaryOperation newBinaryOperation) {

		operationsAvailable.put(binaryOperationSymbol, newBinaryOperation);

	}

	public void disengageBinaryOperation(String binaryOperationSymbol) {

		operationsAvailable.remove(binaryOperationSymbol);

	}

}