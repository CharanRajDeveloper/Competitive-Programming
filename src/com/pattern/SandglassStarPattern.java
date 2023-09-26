package com.pattern;

public class SandglassStarPattern {
	public static void main(String[] args) {
		int row = 10;
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

	}

}
