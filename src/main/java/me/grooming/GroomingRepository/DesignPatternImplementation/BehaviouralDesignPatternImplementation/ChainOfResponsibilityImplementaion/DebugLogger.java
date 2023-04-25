package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ChainOfResponsibilityImplementaion;

public class DebugLogger extends Logger {

	public DebugLogger(int level) {
		
		this.level = level;
		
	}
	
	@Override
	protected void writeLogs(String message) {
		
		System.out.println("[DEBUG] : " + message);

	}

}