package logicalmilestone2;

import java.util.Scanner;

/* 	Write a java program to print total number of notes required for particular amount.
	e.g  Enter amount: 2340
	Total number of notes :- 
	2000 =  1
	500 =  0
	100 =  3
	50 =  0
	20 =  2
	10 =  0
	5 =  0
	2 =  0
    1 =  0
*/
public class TotalNotesForAmount {

	public static void main(String[] args) {
		int Rs[] = {2000,500,100,50,20,10,5,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any amount");
		int amount = sc.nextInt();
		int count=0;
		for(int i=0; i<Rs.length; i++) {
			
			count = amount/Rs[i];
			System.out.println(Rs[i]+"\t=\t "+count);		//instead of " = " use "\t=\t"
			amount = amount%Rs[i];
		}
		
	}

}
