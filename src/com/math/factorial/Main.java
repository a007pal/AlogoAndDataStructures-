package com.math.factorial;

public class Main {

	public static void main(String[] args) {
		System.out.println("From Iterative way "+ getFactorialInter(6));
		System.out.println("From Recurisive way "+ getFactorialRecur(6));
	}

	private static int getFactorialRecur(int n) {
		if (n == 0) {
			return 1;
		}
		return n * getFactorialInter(n-1);
	}

	private static int  getFactorialInter(int n) {
		int fact = 1;
		
		for(int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	

}
