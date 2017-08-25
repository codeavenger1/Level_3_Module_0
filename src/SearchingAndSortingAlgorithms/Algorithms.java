package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

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

			
public static List<Double> sortScores(List<Double> results) {
	Collections.sort(results); 
	return results;
			}


		
 public static List<String> sortDNA(List<String> unsortedSequences) {
	 for (int i = 0; i < unsortedSequences.size(); i++) {
		for (int j = i+1; j < unsortedSequences.size(); j++) {
			String temp = unsortedSequences.get(i);
			String s1 = unsortedSequences.get(j);
			String s2 = unsortedSequences.get(i);
			if (s1.length()<s2.length()) {
				unsortedSequences.set(i,unsortedSequences.get(j));
				unsortedSequences.set(j, temp);
			}
			
		}
		
	}
		return unsortedSequences;
	 
 }

public static List<String> sortWords(List<String> words) {
	
	java.util.Collections.sort(words);
	System.out.println(words);
	
	return words;
}
 }