package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ObserverImplementaion;

public class TollTaxReceipt {
	
	private Integer checkPointKMEntry;
	private Integer checkPointKMExit;
	private Integer tollToBeLevied;
	private CarDetails carDetails;
	
	public TollTaxReceipt(CarDetails carDetails, Integer checkPointKMEntry) {
		
		this.carDetails = carDetails;
		this.checkPointKMEntry = checkPointKMEntry;
		
	}

	public void setcheckPointKMExit(Integer checkPointKMExit) {
		
		this.checkPointKMExit = checkPointKMExit;
		
	}
	
	public void calculateTollToBeLevied( ) {
		
		tollToBeLevied = (checkPointKMExit - checkPointKMEntry) * 24;
		
	}

	public Integer getCheckPointKMEntry() {
		
		return checkPointKMEntry;
		
	}

	public Integer getCheckPointKMExit() {
		
		return checkPointKMExit;
		
	}

	public Integer getTollToBeLevied() {
		
		return tollToBeLevied;
		
	}

	public CarDetails getCarDetails() {
		
		return carDetails;
		
	}
	
	public void printTollTaxReceipt() {
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<< ExpressWay Ltd. >>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("CarDetails Details : " + carDetails.toString());
		System.out.println("Entry Check Point : " + checkPointKMEntry);
		System.out.println("Exit Check Point : " + checkPointKMExit);
		System.out.println("Toll to be Levied : " + tollToBeLevied);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< Thanks Very Much! >>>>>>>>>>>>>>>>>>>>>>");
	}
	
}