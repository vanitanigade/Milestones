package logicalmilstone4;

import java.util.Scanner;

public class Q2_RightDescLeftDescInOneLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows = sc.nextInt();

		System.out.println("printing the pattern");
		char ch = '@';

		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=rows-i; j++) {
				System.out.print(ch);
			}
			for(int k=1; k<= i*2-1; k++) {
				System.out.print(" ");
			}
			for(int l=rows-i; l>=0; l--) {
				if(l!=rows)
					System.out.print(ch);
			}
			sc.close();
			System.out.println();
		}



	}

}
