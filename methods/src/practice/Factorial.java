package practice;

import java.util.Scanner;

// Write a program to obtain factorial 
public class Factorial {

	public static void main(String[] args) {
		int fact = 1;

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a =scan.nextInt();
		for(int i=1 ; i<=a ; ++i) {
			fact = fact*i;
		}
		System.out.println("Factorial of " +a +" is :"+fact);
		

	}

}
