package com.math.compute.power;

public class Main {

	public static void main(String[] args) {
		System.out.println(calculatePower(3, 4));
		System.out.println(calculatePowerEfficent(3, 4));
		System.out.println(calculatePowerIterative(3, 5));
	}

	private static int calculatePower(int x, int n) {
		int result = 1;
		for(int i = 0; i < n; i++) {
			result = result * x;
		}
		return result;		
	}
	private static int calculatePowerEfficent(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int result = calculatePowerEfficent(x, n/2);
		result = result * result;
		if (n % 2 == 0) {
			return result;
		}else {
			return result * x;
		}
		
				
	}
	
	private static int calculatePowerIterative(int x, int n) {
		int result = 1;
		while(n>0) {
			if(n%2 !=0) {
				result = x;
			}
			x = x*x;
			n=n/2;
		}
		return result;		
	}
	

}
