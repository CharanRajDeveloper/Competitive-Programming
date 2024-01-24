package com.logical.programs;

public class DecimalToBinary {
	public static void getBinary(int decimal) {
		int index=0;
		int[] binary=new int[40];
		
		while(decimal!=0) {
			binary[index++]=decimal%2;
			decimal=decimal/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) {
		int decimal=5;
		getBinary(decimal);
		
	}

}
