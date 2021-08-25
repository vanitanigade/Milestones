package logicalmilestone2;

import java.util.Scanner;

public class NoIsPowerOf2 {

	public static void main(String[] args) {

		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		no = sc.nextInt();
		
		while(no%2==0) {
			no=no/2;
		}
		if(no==1)
			System.out.println("is power of 2");
		else 
			System.out.println("is not power of 2");
		
	}

}
