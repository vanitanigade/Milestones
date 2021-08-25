package logicalmilestone3.array5;

import java.util.Scanner;

//1. W.A.J.P. to accept a array and find its sum of elements..

public class SumOfElements_Scanner {

	public static void main(String[] args) {
		int	sum =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("enter array elements");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("array elements are: ");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		
		System.out.println("sum of array elements is: " + sum);


	}
}
