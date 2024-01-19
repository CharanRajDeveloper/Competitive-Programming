package com.logical.programs;

import java.util.Arrays;

public class FirstandSecondLargestNumberusingSort {
	public static int getSecondLargest(int b[],int total) {
		int temp;
		
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		return b[total-2];
		
	}
	public static void main(String[] args) {
		int b[]={44,66,99,77,33,22,55};
		System.out.println("Before sorting:"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After sorting"+Arrays.toString(b));
		System.out.println("First Largest Element is "+b[b.length-1]);
		System.out.println("Second Largest Element is "+getSecondLargest(b,b.length));
	}

}
