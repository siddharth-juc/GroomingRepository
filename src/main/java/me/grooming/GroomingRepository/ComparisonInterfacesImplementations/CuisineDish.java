package me.grooming.GroomingRepository.ComparisonInterfacesImplementations;

public class CuisineDish implements Comparable<CuisineDish> {

	public String dishName;
	public String cuisine;
	public Integer priceForOne;
	
	public CuisineDish(String dishName, String cuisine, Integer priceForOne) {
		
		this.dishName = dishName;
		this.cuisine = cuisine;
		this.priceForOne = priceForOne;
		
	}

	@Override
	public int compareTo(CuisineDish givenCuisineDish) {
		
		return (this.priceForOne - givenCuisineDish.priceForOne);
		
	}

	@Override
	public String toString() {
		return "CuisineDish \n"
				+ "["
				+ "\n\t dishName=" + dishName 
				+ "\n\t cuisine=" + cuisine 
				+ "\n\t priceForOne=" + priceForOne 
				+ "\n]\n";
	}
	
}