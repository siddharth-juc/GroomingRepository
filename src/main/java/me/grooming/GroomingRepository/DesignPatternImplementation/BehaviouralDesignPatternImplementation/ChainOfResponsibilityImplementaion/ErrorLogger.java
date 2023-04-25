package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ChainOfResponsibilityImplementaion;

public class ErrorLogger extends Logger {

	public ErrorLogger(int level) {
		
		this.level = level;
		
	}
	
	@Override
	protected void writeLogs(String message) {
		
		System.out.println("[ERROR] : " + message);

	}

}