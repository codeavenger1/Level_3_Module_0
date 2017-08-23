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
	public static String findLongestWord(List<String> words) {
		String word = "";
		for(String longest : words) {
			words.indexOf(longest);
			if (word.length()<longest.length()) {
				word = longest;
			}
			
		}
		return word;
	}
	public static Boolean containsSOS(List<String> message1) {
		
		for(String contains : message1) {
			
			if (contains.contains("... --- ...")) {
			 return true;
			 
			}
	
		}
		return false;
		
	}
//public static double sortScores(List<Double> results) {
//		double score = 0;
//		for(Double s : results) {
//			results.indexOf(s);
//			if (s>score) {
//			 
//			 
//			}
//	
//		}
//		return score;
//		
//		
//	}

	//Add other methods here
}