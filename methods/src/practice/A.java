package practice;

import java.util.Scanner;

public class A {
	public double areaOfCircle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		double r= scan.nextDouble();
		double area =3.1416*r*r;
		System.out.println(area);
		return area;
	}
	public double areaOfRectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length snd bredth");
		double l =scan.nextDouble();
		double b =scan.nextDouble();
		double area = l*b;
		System.out.println(area);
		return area;
	}

}
