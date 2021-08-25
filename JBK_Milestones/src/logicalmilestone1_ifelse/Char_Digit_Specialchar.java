package logicalmilestone1_ifelse;

import java.util.Scanner;

public class Char_Digit_Specialchar {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a character/digit/special Character");
	char ch = sc.next().charAt(0);
	
	if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z'))
		System.out.println("its a character");
	
	else if (ch >= '0' && ch <='9')
		System.out.println("its a number");
	
	else 
		System.out.println("its a symbol");
	
	
	}
}
