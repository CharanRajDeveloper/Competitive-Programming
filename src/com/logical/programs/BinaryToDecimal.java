package com.logical.programs;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String s="1010";
		System.out.println(Integer.parseInt(s,2));
		
		int n=10101;
		int temp,decimal = 0,count=0;
		while(n!=0) {
			temp=n%10;
			decimal=(int) (decimal+temp*Math.pow(2, count));
			n=n/10;
			count++;
		}
		System.out.println("After Decimal Conversion:"+decimal);
		System.out.println(1%5);
	}

}
