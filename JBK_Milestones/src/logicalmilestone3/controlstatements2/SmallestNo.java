package logicalmilestone3.controlstatements2;
//3. W.A.P to accept two number and find smallest no.

import java.util.Scanner;

public class SmallestNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int number1 = sc.nextInt();
		System.out.println("enter second number");
		int number2 = sc.nextInt();

		if(number1>number2) {
			System.out.println(number2 + " is smallest number");
		}else if(number2>number1){
			System.out.println(number1 + " is smallest number");
		}	else 
			System.out.println("both are same numbers");

	}

}
