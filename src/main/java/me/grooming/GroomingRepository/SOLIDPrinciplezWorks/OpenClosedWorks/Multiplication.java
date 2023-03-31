package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.OpenClosedWorks;

public class Multiplication implements BinaryOperation {

	@Override
	public double execute(double firstNumber, double secondNumber) {

		double answer = firstNumber * secondNumber; 
		return answer;
		
	}

}