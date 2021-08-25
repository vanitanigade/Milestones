package logicalmilestone3.controlstatements2;

import java.util.Scanner;

//6. W.A.P to accept a day of week(int) and display the weekday

public class WeekdaysDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter day number");
		int num = sc.nextInt();

		switch(num) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		default: System.out.println("invalid entry");
		}
	}

}
