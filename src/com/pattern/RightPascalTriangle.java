package com.pattern;

public class RightPascalTriangle {
	public static void main(String[] args) {
		int row = 10;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
        row= 9;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (j >= (row - i)) {
					System.out.print(" ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println(" ");
		}

	}

}
