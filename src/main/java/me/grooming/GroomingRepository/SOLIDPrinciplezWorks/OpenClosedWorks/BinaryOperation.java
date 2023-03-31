package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.OpenClosedWorks;

/*
 * Instead, what we do is isolate the basic idea of binary operation from
 * outside world, i.e., it is where we give 2 inputs, these are passed into some
 * processes for Computation, what we get is a single output.
 * 
 * Thus, we create an interface by name of BinaryOperation with an execute()
 * method to execute the needed BinaryOperation.
 * 
 * Implementation of BinaryOperation execution (i.e., the execute() method) can
 * be done as per the need of the hour. This can be done through implementation
 * of interface by different classes.
 */
public interface BinaryOperation {
	
	public double execute(double firstNumber, double secondNumber);

}