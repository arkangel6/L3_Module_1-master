package SearchingAndSortingAlgorithms;

import static org.junit.Assert.*;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		
		int index = 0;
		for(int i = 0; i< eggs.size(); i++) {
		if(eggs.get(i).equals("cracked")) {
			return i;
		}
		
		}
		
		return index; //<- this needs changing
	}

	public static Object countPearls(List<Boolean> oysters) {
		int counter = 0;
		for(int i = 0; i < oysters.size(); i++) {
			
			if(oysters.get(i)) {
				counter++;
			}
			
		}
		
		return counter;
	}

	public static double findTallest(List<Double> peeps) {
		Double max = peeps.get(0);
		
		for(int i = 0 ; i< peeps.size(); i++) {
			if(peeps.get(i) > max) {
				max = peeps.get(i);
			}
			
		}
		
		
		
		return max;
	}

	public static Object findLongestWord(List<String> words) {
		
		
		char[] w = words.get(0).toCharArray();
		int max = w.length;
		int index = 0;
		for(int i = 0; i < words.size(); i++) {
			
			
			w = words.get(i).toCharArray();
			if(max < w.length) {
				max = w.length;
				index = i;
			}
		
			
			
			
		}
		
		
		
		return words.get(index);
	}

	public static Object containsSOS(List<String> message2) {
		
		for(int i = 0; i < message2.size(); i++) {
			//System.out.println(message2.get(i));
			if(message2.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		
		
		return false;
	}

//	public static List<Double> sortScores(List<Double> results) {
//		double holder = 0;
//		for(int i = 0; i < results.size()-1; i++) {
//			
//			if(results.get(i)>results.get(i+1)) {
//				holder = results.get(i);
//				results.set(i, results.get(i+1));
//				results.set(i+1, holder);
//			}
//			
//			
//		}
//		
//		
//		
//		
//		return results;
//	}
	
	
	//Add other methods here
}