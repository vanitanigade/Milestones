package logicalmilestone3.inheritance8.ques2;

import java.util.Scanner;

public class Cricket {

	int pcode, runs, players, iplayed;	//innings
	String pname, cname;
	double avg=0, avgall=0;

	public Cricket(int pcode, String pname, int runs, int iplayed, String cname) {
		this.pcode = pcode;
		this.runs = runs;
		this.pname = pname;
		this.cname = cname;
		this.iplayed = iplayed;
	}

	/*	public double average (String pname){
	 //	double avg=0;
		avg=(double)runs/(double)iplayed;
		return avg;
	}
	 */

	public double average() {
	//	double avg=0;
		avg += (double)runs/(double)iplayed; 
		return avg;
	}

}
