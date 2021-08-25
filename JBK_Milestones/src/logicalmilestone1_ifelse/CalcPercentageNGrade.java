package logicalmilestone1_ifelse;

import java.util.Scanner;

public class CalcPercentageNGrade {
	
	public static void main(String[] args) {
		
		int total; 
		float per;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of Physics");
		int physics = sc.nextInt();
		System.out.println("enter the marks of Chemistry");
		int chem = sc.nextInt();
		System.out.println("enter the marks of Biology");
		int bio = sc.nextInt();
		System.out.println("enter the marks of Maths");
		int maths = sc.nextInt();
		System.out.println("enter the marks of Computer");
		int comp = sc.nextInt();
		
		per = (physics + chem + bio + maths + comp)/5;
		
		if(per >= 90) {
			System.out.println("Grade A with percentage "+per+"%");
		} 
		else if (per >= 80) {
			System.out.println("Grade B with percentage "+per+"%");
		}
		else if (per >= 70) {
			System.out.println("Grade C with percentage "+per+"%");
		}
		else if (per >= 60) {
			System.out.println("Grade D with percentage "+per+"%");
		}
		else if (per >= 40) {
			System.out.println("Grade E with percentage "+per+"%");
		}
		else {
			System.out.println("Grade F with percentage "+per+"%  = failed");
		}
	}
}
