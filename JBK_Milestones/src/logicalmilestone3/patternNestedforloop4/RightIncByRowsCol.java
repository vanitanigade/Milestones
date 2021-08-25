package logicalmilestone3.patternNestedforloop4;

import java.util.Scanner;

public class RightIncByRowsCol {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows number");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");		//print rowwise by taking i instead of j
			}
			System.out.println();
		}
		
	}

}
