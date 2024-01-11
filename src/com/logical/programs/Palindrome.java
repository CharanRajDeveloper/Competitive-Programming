package com.logical.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to reverse and check");
		String original=sc.nextLine();
		String reverse="";
		//original=original.toUpperCase();
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Original String:"+original);
		System.out.println("Reversed String:"+reverse);
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}

}
