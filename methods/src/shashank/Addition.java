package shashank;

import java.util.Scanner;

public class Addition {
    
	public static void main (String[] args) {
		Scanner A = new Scanner(System.in);
		System.out.println(" Enter two numbers :");
		
		int a=A.nextInt();
		int b=A.nextInt();
		int sum, sub,mul,div;
		sum=a+b;
		System.out.println(" the addition is :"+sum);
		if(a>b) {
			sub=a-b;
			System.out.println(" the substraction is :"+sub);
		}
		else {
			sub=b-a;
			System.out.println(" the substraction is :"+sub);
		}
			
		mul=a*b;
		System.out.println(" the multiplication is :"+mul);
		div=a/b;
		System.out.println(" the divition is :"+div);
		div=a%b;
		System.out.println("the reminder is "+div);
		
		
	}
}
