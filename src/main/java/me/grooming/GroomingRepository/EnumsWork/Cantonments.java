package me.grooming.GroomingRepository.EnumsWork;

public enum Cantonments {
	
	JALANDHAR ("Jalandhar Cantonment", "JRC"), 
	PATHANKOT ("Pathankot Cantonment", "PTKC"), 
	MHOW ("Mhow Cantonment", "DADN"), 
	DELHI ("Delhi Cantonment", "DEC"), 
	SECUNDERABAD ("Secunderabad Cantonment", "SC");

	private final String fullName;
	private final String stationCode;
	
	private Cantonments(String fullName, String stationCode) {
		this.fullName = fullName;
		this.stationCode = stationCode;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getStationCode() {
		return stationCode;
	}
	
}
