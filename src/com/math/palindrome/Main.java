package com.math.palindrome;
/****
 * 
 * @author amit1
 * 
 * Palindrome Number 
 * Idea :- Traverse digits from right to left to find reverse of given number
 * to find the last digit x % 10
 * to get rid of last digit x = x/10
 * example n= 763
 * rev = rev *10 + 7 = 7
 * rev = rev *10 + 6 = 76
 * rev = rev *10 + 3 = 763
 * 
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(isPalindrome(787)?"YES":"NO");

	}

	private static boolean isPalindrome(int n) {
		int rev =0;
		int act = n;
		while(n > 0) {
			rev = (rev * 10) + (n %10);
			n = n/10;
		}
		return rev == act;
	}

}
