package com.math.trailing.zero.factorial;

public class Main {

	public static void main(String[] args) {
		System.out.println(numberOfTrailingZero(10));
		//System.out.println(numberOfTrailingZeroNaive(10));
	}

	/**
	 * Idea - factorial of 10 is 1x2x3x4x5x6x7x8x9x10
	 * as combition of 5 and 2 will from trailing 0 so we can count 5 and 2 we can able to know 
	 * number of trailing zero
	 * 
	 * **/
	private static int numberOfTrailingZero(int n) {
		int result = 0;
		
		for (int i = 5; i <= n; i = i*5) {
			result = result + n/i;
		}
		
		return result;
	}
// From Naive Method 
	private static int numberOfTrailingZeroNaive(int n) {
		int result = 1;
		
		for (int i = 2; i <= n; i++) {
			result = result * i;
		}
		int count = 0;
		while(result % 10 == 0) {
			++count;
			result= result/10;
		}
		return count;
	}
}
