package logicalmilestone3.controlstatements2;
//1. W.A.P to accept a number and find it is even or odd

import java.util.Scanner;

public class NoIsEvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		
		if(number%2 ==0)
			System.out.println("number is even number");
		else
			System.out.println("number is odd number");
		
	}

}
