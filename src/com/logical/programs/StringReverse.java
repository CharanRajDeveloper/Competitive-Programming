package com.logical.programs;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to reverse");
		String data=sc.next();
        for(int i=data.length()-1;i>=0;i--) {
        	System.out.print(data.charAt(i));
        }
        System.out.println();
        //by converting into character array
        System.out.println("by converting into character array");
        char[] c=data.toCharArray();
        for(int i=c.length-1;i>=0;i--) {
        	System.out.print(c[i]);
        }
	}

}
