package com.logical.programs;

public class VowelsCheck {
	public static void calculateVowel(char[] ch) {
		String vowels = "";
		String consonants = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				vowels = vowels + ch[i];
			} else {
				consonants = consonants + ch[i];
			}
		}
		System.out.println("Vowels:"+vowels);
		System.out.println("Consonants:"+consonants);
	}

	public static void main(String[] args) {
		char[] ch = { 'a', 'e', 'E', 'v', 'k', 'l', 'u', 'z' };
		calculateVowel(ch);
	}

}
