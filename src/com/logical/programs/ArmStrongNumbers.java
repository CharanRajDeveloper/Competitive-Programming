package com.logical.programs;

import java.util.Scanner;

public class ArmStrongNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to find whether it is Armstrong number or not");
		int numDigit=sc.nextInt();
		int armstronglogic=numDigit;
		int compare=numDigit;
		int sumval = 0,rem=0,count=0;
		//logic to find the number of digit
		while(numDigit!=0) {
			rem=numDigit%10;
			sumval+=rem;
			count++;
			numDigit=numDigit/10;
		}
		System.out.println("Sum of Digit is:"+sumval);
		System.out.println("Number of Digit is:"+count);
		System.out.println("Number is:"+armstronglogic);
		int result=0;
		//logic to find the Armstrong number
		while(armstronglogic!=0) {
			rem=armstronglogic%10;
			result=(int) (result+(Math.pow(rem, count)));
			armstronglogic=armstronglogic/10;
		}
		System.out.println("ArmStrong Number is:"+compare);
		System.out.println("Result is:"+result);
		if(result==compare) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
		
	}

}
