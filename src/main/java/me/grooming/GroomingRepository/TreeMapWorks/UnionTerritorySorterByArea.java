package me.grooming.GroomingRepository.TreeMapWorks;

import java.util.Comparator;

public class UnionTerritorySorterByArea implements Comparator<UnionTerritory> {

	@Override
	public int compare(UnionTerritory firstUT, UnionTerritory secondUT) {
		
		return firstUT.sizeInKm2 - secondUT.sizeInKm2;
		
	}

}