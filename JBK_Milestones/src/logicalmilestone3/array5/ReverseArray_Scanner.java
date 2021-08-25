package logicalmilestone3.array5;

import java.util.Scanner;

public class ReverseArray_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		
		int a[] = new int[size];	//a[]={10,20,30,40,50}
		
		System.out.println("enter the array elements");
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.print("array elements are: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\n reverse array: ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
