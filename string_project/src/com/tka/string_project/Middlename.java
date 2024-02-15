package com.tka.string_project;

public class Middlename {

	public String getMiddleChar(String str) {
		int index, length ;
		System.out.println(str.length());

		if(str.length()%2==0) { 
			index =str.length()/2;
			index =str.length()/2-1;
			length =2;
		}
		else {
			
			index = str.length()/2;
			length =1;
		}
		return str.substring(index,index +  length );
	}
	public static void main(String[] args) {
		Middlename mm = new Middlename();
		mm.getMiddleChar("mayur");
		System.out.println(mm.getMiddleChar("monika" ));
	}
}
