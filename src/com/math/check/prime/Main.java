package com.math.check.prime;

public class Main {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(65000000));
		System.out.println(isPrimeNumberOtim(65000000));
		System.out.println(isPrimeNumberMoreOtim(65000000));
	}
	
	private static boolean isPrimeNumberMoreOtim(int n) {
		if (n%1 == 0 || n%2 == 0 || n%3 == 0) {
			return false;
		}
		for (int i=5; i*i <= n; i=i+6) {
			if (n % i ==0 || n % i+2 == 0) {
				return false;
			}
		}
		return true;
	}
	/*
	 * multiple exist in pair (1, 65), (5,13)
	 * let (x,y) be a pair
	 * x*y = n
	 * if x<=y
	 * x*x <= n
	 * x <= sqrt(n)
	 * 
	 */
	private static boolean isPrimeNumberOtim(int n) {
		if (n == 1) {
			return false;
		}
		for(int i =2; i*i<=n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	//Naive Method
	private static boolean isPrimeNumber(int n) {
		if (n == 1) {
			return false;
		}
		for (int i =2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	

}
