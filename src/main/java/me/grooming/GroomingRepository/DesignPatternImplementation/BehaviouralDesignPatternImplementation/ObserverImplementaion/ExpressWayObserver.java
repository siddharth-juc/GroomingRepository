package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ObserverImplementaion;

public class ExpressWayObserver {
	
	private TollTaxReceipt tollTaxReceipt;
	
	public void logCarEntryToExpressway(CarDetails carDetails, Integer checkPointKMEntry) {
		
		tollTaxReceipt = new TollTaxReceipt(carDetails, checkPointKMEntry);
		
	}
	
	public void logCarExitFromExpressway(CarDetails carDetails, Integer checkPointKMExit) {
		
		tollTaxReceipt.setcheckPointKMExit(checkPointKMExit);
		tollTaxReceipt.calculateTollToBeLevied();
		tollTaxReceipt.printTollTaxReceipt();
		
	}

}