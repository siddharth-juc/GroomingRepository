package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ChainOfResponsibilityImplementaion;

public class LoggerChain {
	
	public Logger generateLoggerChain() {
		
		Logger infoLogger = new InfoLogger(Logger.INFO);
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger debugLogger = new DebugLogger(Logger.DEBUG);
		
		infoLogger.setNextLogger(errorLogger);
		errorLogger.setNextLogger(debugLogger);
		
		return infoLogger;
		
	}

}