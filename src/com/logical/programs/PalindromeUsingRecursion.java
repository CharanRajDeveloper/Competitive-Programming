package com.logical.programs;

public class PalindromeUsingRecursion {
	public static String recPalindrome(String str) {
		if(str.length()<=1) {
			return str;
		}
		return recPalindrome(str.substring(1))+str.charAt(0);
		
	}

	public static void main(String[] args) {
		String original = "Amma";
		String reverse = recPalindrome(original);
		System.out.println(reverse);
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}

}
