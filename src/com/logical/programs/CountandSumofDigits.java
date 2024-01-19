package com.logical.programs;

public class CountandSumofDigits {
	public static void main(String[] args) {
		int num=1234,rev = 0,sumVal = 0,count = 0;
		
		while(num!=0) {
			rev=num%10;
			sumVal=sumVal+rev;
			num=num/10;
			count++;
		}
		System.out.println("Sum of Number is:"+sumVal);
		System.out.println("Count of Digit is:"+count);
	}

}
