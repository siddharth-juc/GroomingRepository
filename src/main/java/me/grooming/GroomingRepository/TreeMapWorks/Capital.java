package me.grooming.GroomingRepository.TreeMapWorks;

public class Capital implements Comparable<Capital> {
	
	public String capitalName;
	public Integer STDCode;
	
	public Capital(String capitalName, Integer STDCode) {
		this.capitalName = capitalName;
		this.STDCode = STDCode;
	}

	@Override
	public String toString() {
		return "Capital \n"
				+ "["
				+ "\n\t capitalName=" + capitalName 
				+ "\n\t STDCode=" + STDCode 
				+ "\n]\n";
	}

	@Override
	public int compareTo(Capital givenCapital) {
		
		return this.capitalName.compareTo(givenCapital.capitalName);
		
	}

}