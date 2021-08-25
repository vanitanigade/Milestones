package logicalmilestone1_ifelse;

import java.util.Scanner;

public class CalculateGrossSalary {

	// Basic salary <= 10000: HRA=20%, DA=80%
	// Basic salary <= 20000: HRA=25%, DA=90%
	// Basic salary > 20000: HRA=30%, DA=95%

	public static void main(String[] args) {

		double basicSal, grossSal, da, hra;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basic salary of an employee");
		
		basicSal = sc.nextDouble();

		if(basicSal <= 10000) {
			da = basicSal * 0.8;
			hra = basicSal * 0.2;
		}
		else if(basicSal <= 20000) {
			da = basicSal * 0.9;
			hra = basicSal * 0.25;
		}
		else {
			da = basicSal * 0.95;
			hra = basicSal * 0.3;
		}
		grossSal = basicSal + hra + da;
		System.out.println("employee's HRA "+ hra);
		System.out.println("employee's DA "+ da);
		System.out.println("employee's gross salary "+ grossSal);
	}

}
