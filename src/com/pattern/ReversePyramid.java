package com.pattern;

public class ReversePyramid {
	public static void main(String[] args) {

		int row=4;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
	
	}

}
