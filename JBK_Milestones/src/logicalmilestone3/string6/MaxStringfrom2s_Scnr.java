package logicalmilestone3.string6;
//6. Enter 2 strings from user find the max string.. 7. Enter 2 strings from user find the max length of string.. 

import java.util.Scanner;

public class MaxStringfrom2s_Scnr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.next();
		System.out.println("enter second string");
		String s2 = sc.next();

		if((s1.length()) > (s2.length()))
			System.out.println("String s1 has max length");
		else
			System.out.println("String s2 has max length");

	}

}
