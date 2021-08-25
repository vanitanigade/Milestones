package logicalmilestone3.controlstatements2;
//5. W.A.P to accept a year check whether it is Leap Year or not.
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year = sc.nextInt();

		if(year !=0) {

			if(year%400==0 || (year%4==0 && year%100 !=0)) {
				System.out.println(year + " is leap year");
			} else
				System.out.println(year + " is not leap year");

		}else 
			System.out.println(year + " is not valid year");

		/*	for(int year=2012; year<=2100; year++) {				//leap year list
			if(year%400==0 || (year%4==0 && year%100 !=0)) 
				System.out.println(year);
		} */
	}
}
