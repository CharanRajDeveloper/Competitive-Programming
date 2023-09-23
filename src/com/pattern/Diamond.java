package com.pattern;

public class Diamond {
	public static void main(String[] args) {
		// Diamond pattern is nothing but LeftTriangle and DownWardLeftTriangle
		// Beginning of LeftTriangle
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (j >= (row - i - 1)) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");
		}
		// End of LeftTriangle

		// Beginning of DownWardLeft Triangle
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
		// End of DownWardLeft Triangle

	}

}
