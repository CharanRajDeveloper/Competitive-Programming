package com.logical.programs;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharactersinaString {
	public static void main(String[] args) {
		//Finding the number of counts in a statement
		String str = "This This is is done by charan This charan";
		String strAr[] = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strAr.length; i++) {
			if (map.containsKey(strAr[i])) {
				int count = map.get(strAr[i]);
				map.put(strAr[i], count + 1);
			} else {
				map.put(strAr[i], 1);
			}
		}
		System.out.println(map);
		
		//Finding the number of count in a word
		Map<Character, Integer> mapword = new HashMap<Character, Integer>();
		String word="CharanRaj";
		
		for(int i=0;i<word.length();i++) {
			if(mapword.containsKey(word.charAt(i))) {
				int c=mapword.get(word.charAt(i));
				mapword.put(word.charAt(i),c+1);
			}else {
				mapword.put(word.charAt(i),1);
			}
		}
		System.out.println(mapword);	
	}

}
