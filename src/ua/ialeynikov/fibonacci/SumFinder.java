package ua.ialeynikov.fibonacci;

import java.util.Scanner;

public class SumFinder {
	
	private static final int LIMIT = 4000000; 
	
	public static void main(String[] args) {
		
		SumFinder sumFinder = new SumFinder();
		System.out.println("The sum of even Fibonacci numbers lesser than 4000000 is " + sumFinder.findSum(LIMIT));
		//System.out.println(sumFinder.findVarLimitSum());
	}
		
	private long findSum (int limit){
	
		int currentTerm = 2;
		int previousTerm = 1;
		int nextTerm = 0;
		long result = 0;
		
		while (currentTerm < limit){
			if(currentTerm % 2 == 0){
				result += currentTerm;
			}
			nextTerm = currentTerm + previousTerm;
			previousTerm = currentTerm;
			currentTerm = nextTerm;
		}
		
		return result;
		
	}
	
	/*
	 * Method can be used to find sum of even terms lesser than variabe limit  
	 */
	private String findVarLimitSum(){
		int limit = 0;
		
		System.out.println("Please input variable limit: ");
		Scanner scanner = new Scanner(System.in);
		try {
			limit = scanner.nextInt();
		} catch (Exception e) {
			System.err.println("Please, input nubmer lesser than " + Integer.MAX_VALUE);
		}
		
		scanner.close();
		return "The sum of even Fibonacci numbers lesser than limit is " + findSum(limit);
	}

}
