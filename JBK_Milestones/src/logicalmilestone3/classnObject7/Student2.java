package logicalmilestone3.classnObject7;
//5. W.A.java program create a class Student details which having roll_no, name, and 5 subjects marks[ ].
// Accept a students records, find total_marks and percentage. display the all student data

import java.util.Arrays;

public class Student2 {
	
	int roll_no;
	String name;
	int sub[] = new int[5];
	
	public Student2(int roll_no, String name, int sub[] ) {
		this.roll_no = roll_no;
		this.name = name;
		this.sub = sub;
	}
	
	@Override
	public String toString() {
		return "Student2 [roll_no=" + roll_no + ", name=" + name + ", sub=" + Arrays.toString(sub) + "]";
	}
						//OR
	void display() {
		System.out.println(roll_no);
		System.out.println(name);
		for(int i=0; i<sub.length; i++) {
			System.out.println(sub[i]);
		}
	}
	
	

}
