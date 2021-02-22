package com.math.LCM;

public class Main {

	public static void main(String[] args) {
		System.out.println("Get the LCM "+ findLCM(3,7));
		System.out.println("Get the LCM Optim "+ findLCMOptim(3,7));
	}
	//Naive Apparoch
	private static int findLCM(int a, int b) {
		int result = Math.max(a, b);
		
		while(true) {
			if((result % a == 0)&&(result % b == 0)) {
				break;
			}
			result ++;
		}
		return result;
	}
	
	/*Euclidian Appraoch
	 * a*b = gcd(a,b) * lcm(a,b) 
	 */
	private static int findLCMOptim(int a, int b) {
		return (a * b)/gcd(a,b);
	}
	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	
	
}
