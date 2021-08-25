package logicalmilestone3.simpleprograms1;

import java.util.Scanner;

//5. W.A.P to accept the radius and find area of circle.

public class CalcArea {
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the radius");
	int radius = sc.nextInt();
	
	double areaOfCircle = 3.14 * radius*radius;
	System.out.println(areaOfCircle);
	
}
}