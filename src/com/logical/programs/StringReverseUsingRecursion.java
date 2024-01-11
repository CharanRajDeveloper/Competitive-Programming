package com.logical.programs;

public class StringReverseUsingRecursion {
	// recursive function to reverse a string
	public String reverseString(String str)  
	{  
	//checks if the string is empty   
	if(str==null || str.length()<=1) 
	{  
	
	//if the above condition is true returns the same string      
	return str;  
	}   
	
	return reverseString(str.substring(1))+str.charAt(0);  
	}  
	

	public static void main(String[] args) {
		StringReverseUsingRecursion rs = new StringReverseUsingRecursion();
		String resultantSting1 = rs.reverseString("amma");
		System.out.println(resultantSting1);
	}

}
