package com.math.all.prime;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		printAllPrime(65);

	}

	private static void printAllPrime(int n) {
		if (n < 1) {
			return;
		}
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		for (int i = 2; i <= n; i++) {
			if(isPrime[i]) {
				System.out.print(i + " ");
				for (int j = i*i; j<=n; j= j+i) {
					isPrime[j] = false;
				}
			}
		}
		
	}

}
