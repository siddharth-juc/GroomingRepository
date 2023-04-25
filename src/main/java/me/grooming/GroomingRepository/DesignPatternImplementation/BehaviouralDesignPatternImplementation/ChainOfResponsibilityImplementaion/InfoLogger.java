package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ChainOfResponsibilityImplementaion;

public class InfoLogger extends Logger {

	public InfoLogger(int level) {
		
		this.level = level;
		
	}
	
	@Override
	protected void writeLogs(String message) {
		
		System.out.println("[INFO] : " + message);

	}

}