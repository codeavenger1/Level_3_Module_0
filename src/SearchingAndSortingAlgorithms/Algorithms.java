package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int broken = 0;
		for(String cracked : eggs) {
			
			if (cracked.contains("cracked")) {
					return broken;
			}
			 broken ++;
		}
		
		return 0;

			
		
		 //<- this needs changing
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for(Boolean found : oysters) {
			
			if (found.equals(true)) {
				return pearls;
			}
			pearls++;
		}
		return 0;
	}
	
	public static double findTallest(List<Double> peeps) {
		double person = 0;
		for(Double tallest : peeps) {
			peeps.indexOf(tallest);
			if (tallest>person) {
				person = tallest;
	
			}
		
		}
		return person;
	}
	
	//Add other methods here
}