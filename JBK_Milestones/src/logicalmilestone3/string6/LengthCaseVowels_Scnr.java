package logicalmilestone3.string6;
//1. Enter a string from user and find the length of string, print it in UPPER and lower case, print only vowels


import java.util.Scanner;

public class LengthCaseVowels_Scnr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		for(int i=0; i<=s.length()-1; i++) {	//string index start from zero so length-1
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				System.out.println(s.charAt(i));
		}}
		
	}

}
