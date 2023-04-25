package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.StateImplementaion;

public class SelfServiceKiosk {
	
	private String kioskID;
	private KioskState currentKioskState;
	
	public SelfServiceKiosk(String kioskID) {
		super();
		this.kioskID = kioskID;
	}

	public String getKioskID() {
		return kioskID;
	}

	public KioskState getCurrentKioskState() {
		return currentKioskState;
	}

}