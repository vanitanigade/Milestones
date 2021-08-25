package logicalmilestone2;

import java.util.Scanner;

public class NoIsPowerOf2OrNot {

	public static void main(String[] args) {

		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		no = sc.nextInt();
		
		if(no % 2 == 1)
			System.out.println("this no cant be power of 2");
		else {
			while(no !=1) {
				if(no%2==1) {
					System.out.println("number is not power of 2");
					break;
				}
				no = no/2;
			}
			if(no==1)
				System.out.println("power of 2");
		}
			
	}

}
