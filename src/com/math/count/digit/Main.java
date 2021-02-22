package com.math.count.digit;

public class Main {

	public static void main(String[] args) {
		System.out.println(countNumberDigit(12895));

	}

	private static int countNumberDigit(int n) {
		int count = 0;		
		while(n > 0) {
			n = n/10;
			++count;
		}
		return count;
	}

}

