package me.grooming.GroomingRepository.ComparisonInterfacesImplementations;

import java.util.Comparator;

public class DishSorterByName implements Comparator<CuisineDish> {

	@Override
	public int compare(CuisineDish firstDish, CuisineDish secondDish) {
		
		return firstDish.dishName.compareTo(secondDish.dishName);
		
	}

}