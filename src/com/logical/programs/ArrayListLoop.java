package com.logical.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListLoop {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(2,4,5,6,8,9));
		System.out.println(al);
		//Advanced For Loop
		System.out.println("-----------Using Advanced For Loop----------------");
		for(int i:al) {
			System.out.println(i);
		}
		System.out.println("-----------End of Advanced For Loop----------------");
		//While Loop
		System.out.println("-----------Using While Loop----------------");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------End of While Loop----------------");
		//Using for loop
		System.out.println("-----------Using For Loop----------------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----------End of For Loop----------------");
	}

}
