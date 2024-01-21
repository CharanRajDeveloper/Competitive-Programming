package com.logical.programs;

import java.util.Arrays;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		int[] a = {6,1, 2, 2, 3,};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = '!';
				}
			}
			
		// Removing Duplicate characters logic
			if (a[i] != '!') {
				System.out.print(a[i] + " ");
			}
			
		}

	}

}