package com.logical.programs;

public class PrintOnlyDuplicateCharacters {
	public static void main(String[] args) {
          int a[]= {1,2,6,6,3,4,2,3};
          for(int i=0;i<a.length;i++) {
        	   int count=0;
        	  for(int j=i+1;j<a.length;j++) {
        		  if(a[i]==a[j]) {
        			  count++;
        			  a[j]='\n';
        		  }
        	  }
        	  if(count!=0 && a[i]!='\n') {
        		  System.out.println(a[i]);
        	  }
          }
	}
}
