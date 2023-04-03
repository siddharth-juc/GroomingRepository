package me.grooming.GroomingRepository.TreeMapWorks;

public class UnionTerritory implements Comparable<UnionTerritory> {
	
	public String nameOfUT;
	public Integer sizeInKm2;
	
	public UnionTerritory(String nameOfUT, Integer sizeInKm2) {
		
		this.nameOfUT = nameOfUT;
		this.sizeInKm2 = sizeInKm2;
		
	}

	@Override
	public int compareTo(UnionTerritory givenUT) {
		
		return this.nameOfUT.compareTo(givenUT.nameOfUT);
		
	}

	@Override
	public String toString() {
		
		return "UnionTerritory \n"
				+ "["
				+ "\n\t nameOfUT=" + nameOfUT 
				+ "\n\t sizeInKm2=" + sizeInKm2 
				+ "\n]\n";
		
	}
	
}