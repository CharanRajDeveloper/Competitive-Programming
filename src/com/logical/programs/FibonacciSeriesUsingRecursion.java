package com.logical.programs;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	static int a=0,b=1,c=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fibonacci number");
		int num=sc.nextInt();
		System.out.print(a+" "+b+" ");
		fibo(num-2);
		
	}
	private static void fibo(int i) {
		if(i>0) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			fibo(i-1);
		}
		
	}

}
