package logicalmilestone2;

import java.util.Scanner;

public class PrimeFactorsOfANumber {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();		//24

		for(int i=2; i<num; i++) {	//24%2 -> true  //24%3 -> true
			if(num%i==0) {
				if(isPrime(i))		//2	//3
					System.out.println(i);	//2
			}
		}
	}

	static boolean isPrime(int num) {	//num=2  //num=3
		int i;
		for(i=2; i<num; i++) {			//i<2=2<2 -> false //3<3 -> false
			if(num%i==0) {
				break;
			}
		}
		if(i==num)
			return true;
		else
			return false;
	}
}
