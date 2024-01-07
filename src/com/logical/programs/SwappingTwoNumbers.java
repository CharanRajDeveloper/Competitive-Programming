package com.logical.programs;

import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers to swap");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping:\n"+a+"\n"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping without using 3rd variable:\n"+a+"\n"+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("using 3rd variable:\n"+a+"\n"+b);
		
		
	}

}
