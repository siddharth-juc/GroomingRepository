package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.OpenClosedWorks;

public class DisplacementMagnitudeCalculationFromOriginInCartesianCoOrdinate2DGeometry implements BinaryOperation {

	@Override
	public double execute(double firstNumber, double secondNumber) {

		double answer = Math.hypot(firstNumber, secondNumber); 
		return answer;
		
	}

}