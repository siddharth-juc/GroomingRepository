package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.ObserverImplementaion;

public class CarDetails {

	private String carRegistrationNumber;
	private String ownerName;
	private Boolean isInsured;
	private Boolean isCheckedForPollutionControl;
	
	public CarDetails(String carRegistrationNumber, String ownerName, Boolean isInsured,
			Boolean isCheckedForPollutionControl) {
		
		this.carRegistrationNumber = carRegistrationNumber;
		this.ownerName = ownerName;
		this.isInsured = isInsured;
		this.isCheckedForPollutionControl = isCheckedForPollutionControl;
		
	}

	public String getCarRegistrationNumber() {
		
		return carRegistrationNumber;
		
	}
	
	public String getOwnerName() {
		
		return ownerName;
		
	}
	
	public Boolean getStatusForInsurance() {
		
		return isInsured;
		
	}
	
	public Boolean getStatusForPollutionControl() {
		
		return isCheckedForPollutionControl;
		
	}

	@Override
	public String toString() {
		
		return "CarDetails [carRegistrationNumber=" + carRegistrationNumber + ", ownerName=" + ownerName + ", isInsured="
				+ isInsured + ", isCheckedForPollutionControl=" + isCheckedForPollutionControl + "]";
				
	}
	
}