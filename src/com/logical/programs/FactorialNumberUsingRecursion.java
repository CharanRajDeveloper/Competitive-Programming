package com.logical.programs;

public class FactorialNumberUsingRecursion {
	public static int fact=1;
	public static void recFact(int n) {
		if(!(n==0) && !(n<=0)) {
			fact=fact*n;
		}else {
			System.out.println("Factorial of a Number:"+fact);
			System.exit(0);
		}
		recFact(n-1);
	}
	public static void main(String[] args) {
		int n=6;
	   recFact(n);
	}

}
