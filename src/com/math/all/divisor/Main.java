package com.math.all.divisor;

public class Main {

	public static void main(String[] args) {
		printAllDivisor(65);
	}

	private static void printAllDivisor(int n) {
		int i = 1;
		for (i = 1; i*i < n; i++) {
			if (n % i == 0) {
				System.out.print(i+" ");
			}
		}
		for (; i >1; i--) {
			if (n % i == 0) {
				System.out.print(n/i + " ");
			}
		}
		
	}

}
