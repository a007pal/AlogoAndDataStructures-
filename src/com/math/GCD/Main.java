package com.math.GCD;

public class Main {

	public static void main(String[] args) {
		System.out.println("Get the GCD Number "+getGcdNumber(3,10));
		System.out.println("Get the GCD Number "+getGcdNumberEuclidean(3,10));
		System.out.println("Get the GCD Number optim "+getGcdNumberEuclideanOptim(3,10));

	}


	// Naive approach
	private static int getGcdNumber(int a, int b) {
		int result = Math.min(a, b);
		
		while(result > 0) {
			if ((a % result ==0) && (b%result == 0)) {
				break;
			}
			result --;
		}
		return result;
	}
	
	/*Euclidean Algorithim
	 * Basic Idea :-
	 * Let 'b' be smaller than 'a'
	 * gcd(a, b) = gcd (a-b, b)
	 * 
	 * why ? 
	 * Let 'g' be GCD of 'a' and 'b'
	 * a = gx and b = gy and gcd(x,y) = 1
	 * a-b = g(x-y)
	 *  so g will be gcd of both a-b and b 
	 */
	private static int getGcdNumberEuclidean(int a, int b) {
		while(a != b) {
			if (a > b) {
				a = a - b;
			}else {
				b = b - a;
			}
		}
		return a;
	}
	// optimised eucliean Algorithim
	
	private static int getGcdNumberEuclideanOptim(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGcdNumberEuclideanOptim(b, a%b);
	}
	
	
	

}
