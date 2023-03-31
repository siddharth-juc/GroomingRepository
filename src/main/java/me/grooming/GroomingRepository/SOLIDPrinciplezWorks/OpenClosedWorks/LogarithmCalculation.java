package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.OpenClosedWorks;

public class LogarithmCalculation implements BinaryOperation {

	@Override
	public double execute(double firstNumber, double secondNumber) {

		double answer = Math.log(firstNumber) / Math.log(secondNumber); 
		return answer;
		
	}

}