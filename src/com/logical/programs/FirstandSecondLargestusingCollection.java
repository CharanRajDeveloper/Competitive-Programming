package com.logical.programs;

import java.util.Arrays;

public class FirstandSecondLargestusingCollection {
	public static void main(String[] args) {
		// to get second largest element or number in java array using collections.
		int[] a= {1,2,5,6,3,2}; 
		Arrays.sort(a);
		System.out.println("Second highest:"+a[a.length-2]);
		
	}

}
