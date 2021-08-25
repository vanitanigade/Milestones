package logicalmilestone2;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int digitCount[] = new int[10];	//array to hold frequency of corresponding digits i.e freq of 0 at index 0, freq of 1 at index 1 and so on
		while(num!=0) {
			int lastDigit = num%10;
			digitCount[lastDigit]++;	//incrementing last digit count //****doubt/
			num = num/10;				// removing last digit from input number
			
		}
		System.out.println("Digit : Frequency");
		for(int i=0; i<digitCount.length; i++) {
			if(digitCount[i] !=0)
				System.out.println("   "+ i + "  :  " + digitCount[i]) ;
		}
				
		
	}

}
