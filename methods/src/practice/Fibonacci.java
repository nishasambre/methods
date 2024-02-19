package practice;

import java.util.Scanner;

// writea program tpo obtain fibonacci series
public class Fibonacci {

	public static void main(String [] args) {
		int a,b,c ;
	     a=0 ;b=1 ; c=0;
	     
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter a number for fibonacci series upto : ");
	     int n = scan.nextInt();
	     System.out.print(a+" "+b);
	     for(int i=1;i<=n;++i) {
	    	 
	    	c=a+b;
	    	System.out.print(" "+c);
	    	 a=b; 
	    	 b=c;
	     }  
	}

}
