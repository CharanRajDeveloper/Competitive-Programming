package com.logical.programs;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str="Charan is a Software Develo per";
		str=str.replaceAll("\s","");
		System.out.println("After Removing Whitespaces:"+str);
	}

}
