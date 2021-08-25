package logicalmilestone3.string6;
//8. Write a program in java to check whether the entered character is alphabet, digit or symbols.

import java.util.Scanner;

public class CharDigitSpecialChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		
		if(ch >='A' && ch <='Z' || ch >='a' && ch<='z')
			
			System.out.println("entered character is alphabet");
		
		else if(ch >='0' && ch <='9') 
			System.out.println("entered character is digit");
		
		else 
			System.out.println("entered character is symbol");
		

		
	}

}
