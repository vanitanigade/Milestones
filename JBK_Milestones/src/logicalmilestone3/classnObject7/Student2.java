package logicalmilestone3.classnObject7;
//5. W.A.java program create a class Student details which having roll_no, name, and 5 subjects marks[ ].

// Accept a students records, find total_marks and percentage. display the all student data

import java.util.Arrays;

public class Student2 {

	int roll_no;
	String name;
	int sub[] = new int[5];
	int total = 0;
	float percentage;

	public Student2(int roll_no, String name, int sub[]) {
		this.roll_no = roll_no;
		this.name = name;
		this.sub = sub;
		compute();
	}

	void compute() {
		for (int i = 0; i < sub.length; i++) {
			total = total + sub[i];
		}
		percentage = total / 5;
	}

	@Override
	public String toString() {
		return "Student2 [roll_no=" + roll_no + ", name=" + name + ", sub=" + Arrays.toString(sub) + ", total=" + total
				+ ", percentage=" + percentage + "]";
	}

	// OR
	void display() {
		System.out.print("roll no: " + roll_no + " ");
		System.out.print("name: " + name + " ");
		System.out.println("marks: " + Arrays.toString(sub));
		System.out.println("total: " + total);
		System.out.println("percentage: " + percentage);
		System.out.println("marks in object form: ");		
		for (int i = 0; i < sub.length; i++) {				//objects of marks
			System.out.print(sub[i] + " ");
		}
		System.out.println();
	}

}
