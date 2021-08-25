package logicalmilestone3.controlstatements2;
//2. W.A.P to accept a number and find it Zero, Positive or Negative.

import java.util.Scanner;

public class NoIs0PositiveOrNeg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();

		if(number>0) {
			System.out.println("positive number");
		}else if(number<0) {
			System.out.println("negative number");
		}else
			System.out.println("number is 0");
	}


}
