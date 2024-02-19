package aa;

import java.util.Scanner;

public class AA {
	double areaOfSquare() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter size of square");
		double a = scan.nextDouble();
		double area = a*a;
		System.out.println("Area Of Square is =" + area);
		return area;
		
	}

}
