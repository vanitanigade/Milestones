package logicalmilestone3.inheritance8.ques2;

import java.io.IOException;
import java.util.Scanner;

public class Cricket_Main {

	public static void main(String[] args) throws IOException{
		double avgall=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many players");
		int players = sc.nextInt();
		Cricket cric[] = new Cricket[players];
		for(int i=0; i<players; i++) {
			System.out.println("enter player code");
			int pcode = sc.nextInt();
			System.out.println("enter player name");
			String pname = sc.next();
			System.out.println("enter runs");
			int runs = sc.nextInt();
			System.out.println("enter no of innings played");
			int iplayed = sc.nextInt();
			System.out.println("enter country name");
			String cname = sc.next();
			cric[i] = new Cricket(pcode, pname, runs, iplayed, cname);
			System.out.println("=============================");
		}
		for(int i=0; i<players; i++) {
		 avgall = cric[i].average();
		System.out.println("Average of " + cric[i].pname + " is: " + avgall);
		}
		sc.close();
	}
}
