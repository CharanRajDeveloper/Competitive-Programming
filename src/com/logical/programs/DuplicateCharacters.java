package com.logical.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String s="Charan chethana zaz";
		char[] ch=s.toCharArray();
		int count=1;
		Set<Character> set=new HashSet<>();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]!=' ' && ch[i]==ch[j] && (!set.contains(ch[i]))) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch[i]+" is repeated for:"+count);
				set.add(ch[i]);
			}
			count=1;
		}
		System.out.println(set);
		if(!set.contains('a')) {
			System.out.println(set.contains('a'));
		}
		
	}

}
