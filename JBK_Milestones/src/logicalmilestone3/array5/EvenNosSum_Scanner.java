package logicalmilestone3.array5;
//2. W.A.J.P. to accept a array and print only even nos..

import java.util.Scanner;

public class EvenNosSum_Scanner {

	public static void main(String[] args) {

		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("enter array elements");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.print("even numbers: ");
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				System.out.print(a[i] + " ");
				sum = sum+a[i];
			}
		}

		System.out.println("\n sum of even numbers: " + sum);
	}
}
