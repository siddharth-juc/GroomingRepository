package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ChainOfResponsibilityImplementaion;

public abstract class Logger {
	
	public static int INFO = 0;
	public static int ERROR = 1;
	public static int DEBUG = 2;
	
	protected int level;
	
	protected Logger nextLogger;
	
	public void setNextLogger(Logger nextLogger) {
		
		this.nextLogger = nextLogger;
		
	}
	
	public void logMessage(int level, String message) {
		
		if(this.level <= level) 
			this.writeLogs(message);
		
		else if(nextLogger != null)
			nextLogger.logMessage(level, message);
		
	}

	protected abstract void writeLogs(String message);
	
}