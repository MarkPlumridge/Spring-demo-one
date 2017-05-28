package com.luc2code.springdemo;

public class BubbleSort {
	
	public static StringBuffer printNumbers(int [] numbers) {
		
		StringBuffer list = new StringBuffer();
		
		// loop through all numbers;
		for (int loop=0; loop < numbers.length; loop++) {
			
			list.append(numbers[loop] + ",");
			
		}
		
		return list;
		
	}

	public static void main(String[] args) {

		// int [] numbers = { 7, 5, 3, 9, 5, 1 };
		int [] numbers = { 3, 6, 4, 8, 1, 2 };
		
		System.out.println("Number to sort = " + printNumbers(numbers).toString());
		
		boolean allSorted = false;
		
		int length = numbers.length;
		
		int iterationCount = 0;
		
		while (allSorted == false) {
			
			boolean swapped = false;
			
			iterationCount++;
			
			System.out.println("");
			System.out.println("Iteration : " + iterationCount); 
			System.out.println("---------");
			
			// loop through all numbers;
			
			for (int loop=0; loop < length; loop++) {
				

				int firstPair = numbers[loop];
				
				int secondPair = 0;
				
				if (loop + 1 >= length) break;
				
				secondPair = numbers[loop + 1];
				
				if (secondPair < firstPair ) {
					
					// swap the numbers;
					System.out.println("Swapping : " + secondPair + " with " + firstPair);
					numbers[loop] = secondPair;
					
     				numbers[loop+1] = firstPair;
						
					swapped = true;
					
				}
				
			}
			
			if (swapped == false) allSorted = true;
			
		}
		
		System.out.println("Numbers sorted = " + printNumbers(numbers).toString());
			
		
		System.exit(0);
		
	}
	
}
