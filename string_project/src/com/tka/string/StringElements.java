package com.tka.string;



public class StringElements {

	public static void main(String[] args) {
		
		String str = "mayur";
		
	
//		returns numeric values of char at the index number 
		
//		System.out.println(str.codePointCount(0, 1));
//		returns numeric value of the char  present before the index number 
		
//		System.out.println(str.codePointBefore(1));
//		returns numeric value of the char present at the  index number  
		
//		System.out.println(str.codePointAt(1));
		
//	    seperate all the character values of the string using for loop
		
		for(int i=0 ; i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
//		seperate the char values of the string by using for each loop
		
		for (char i : str.toCharArray()) {
			System.out.print(i + " ");
		}
	}
}
