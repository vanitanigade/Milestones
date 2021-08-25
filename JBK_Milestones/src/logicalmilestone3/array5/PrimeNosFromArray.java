package logicalmilestone3.array5;
//5. W.A.J.P. to accept a array and print only prime nos array ..

import java.util.Scanner;

public class PrimeNosFromArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();

		int a[] = new int[size];	//a[]={10,20,30,40,50}

		System.out.println("enter the array elements");
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}

		System.out.print("Prime numbers from array: ");
		for(int j=0; j<a.length; j++) {

			int n=a[j]; int flag=0;

			for(int i=0; i<n; i++) {
				if(n%2==0) {
					flag=1;
					break;
				}
			}	
			if(flag==0)
				System.out.print(a[j] + " ");
		}

	}

}
