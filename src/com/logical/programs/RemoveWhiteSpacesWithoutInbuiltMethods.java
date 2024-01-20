package com.logical.programs;

public class RemoveWhiteSpacesWithoutInbuiltMethods {
	public static void main(String[] args) {
		String str="Charan is a Good Boy";
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ' && ch[i]!='\t') {
				sb.append(ch[i]);
			}
		}
		System.out.println("After Removing the whitespaces:"+sb);
	}

}
