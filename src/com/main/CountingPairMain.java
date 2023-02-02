package com.main;

public class CountingPairMain {

	public static void main(String[] args) {
		
		
		
		
//		int[] countingPairs = {   1, 2, 3, 4, 5, 6 };
//		int k = 2;
//		int distinctCount = 0;
//		for (int i = 0; i < countingPairs.length-1; i++) {
//			
//				if (countingPairs[i] + k == countingPairs[i+1]) {
//					distinctCount++;
//				}
//			
//			
//		}
//		System.out.println(distinctCount);
	
		int[] countingPairs = { 1, 2, 3, 4, 5, 6 };
		int k = 2;
		int distinctCount = 0;
		for (int i = 0; i < countingPairs.length-1; i++) {
			for (int j = i + 1; j < countingPairs.length; j++) {
				if (countingPairs[i] + k == countingPairs[j]) {
					distinctCount++;
				}
			}
			
		}
		System.out.println(distinctCount);
	}

}
