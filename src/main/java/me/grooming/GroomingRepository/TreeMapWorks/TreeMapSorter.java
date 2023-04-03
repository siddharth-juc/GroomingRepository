package me.grooming.GroomingRepository.TreeMapWorks;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapSorter {
	
	public static void printUnionTerritoriesWithCapitals(Map<UnionTerritory, Capital> unionTerritoriesOfIndia) {
		
		for(Map.Entry<UnionTerritory, Capital> unionTerritoryWithCapital : unionTerritoriesOfIndia.entrySet()) {
			
			System.out.println(unionTerritoryWithCapital.getKey().toString() 
					+ "\n =====> \n" + unionTerritoryWithCapital.getValue().toString());
			
		}
		
	}
	
	public static void sortByUTsInDescendingOrder(TreeMap<UnionTerritory, Capital> unionTerritoriesOfIndia) {
		
		NavigableMap<UnionTerritory, Capital> unionTerritoriesInReverseOrder = 
				unionTerritoriesOfIndia.descendingMap();
		
		printUnionTerritoriesWithCapitals(unionTerritoriesInReverseOrder);
		
	}
	
	public static void sortByAreaThroughComparator(TreeMap<UnionTerritory, Capital> unionTerritoriesOfIndia) {
		
		Map<UnionTerritory, Capital> unionTerritoriesOfIndiaAreaWise = 
				new TreeMap<>(new UnionTerritorySorterByArea());
		
		unionTerritoriesOfIndiaAreaWise.putAll(unionTerritoriesOfIndia);
		
		printUnionTerritoriesWithCapitals(unionTerritoriesOfIndiaAreaWise);
		
	}
	
	public static void sortByCapital(TreeMap<UnionTerritory, Capital> unionTerritoriesOfIndia) {
		
		Map<UnionTerritory, Capital> unionTerritoriesOfIndiaByCapitals = 
				new TreeMap<>(
						
						new Comparator<UnionTerritory>() {

							@Override
							public int compare(UnionTerritory firstUT, UnionTerritory secondUT) {
								
								return unionTerritoriesOfIndia.get(firstUT).
										compareTo(unionTerritoriesOfIndia.get(secondUT));
								
							}
							
						}
						
						);
		
		unionTerritoriesOfIndiaByCapitals.putAll(unionTerritoriesOfIndia);
		
		printUnionTerritoriesWithCapitals(unionTerritoriesOfIndiaByCapitals);
		
	}

}