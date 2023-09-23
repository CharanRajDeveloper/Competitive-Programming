package com.pattern;

public class Pyramid {
	public static void main(String[] args) {
		// It is similar to Left Triangle ,but should focus on spacing part.
		int row=4;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(j>=(row-i-1)) {
					System.out.print(" *"); //here beginning space is important
				}else {
					System.out.print(" "); //one tab space is important
				}
			}
			System.out.println("");
		}
	}

}
