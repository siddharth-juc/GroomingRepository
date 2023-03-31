package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.OpenClosedWorks;

public class Exponentiation implements BinaryOperation {

	@Override
	public double execute(double firstNumber, double secondNumber) {

		double answer = Math.pow(firstNumber, secondNumber); 
		return answer;
		
	}
	
}