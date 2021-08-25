package logicalmilestone3.classnObject7;
//1. W.A.java program create a class Student details which having roll_no, name, percentage. 
//Accept a student records and display it [use accept_data() and display_data() methods..].

public class Student {

	int roll_no;
	String name;
	float per;


	public void accept_data(int roll_no, String name, float per) {
		this.roll_no = roll_no;
		this.name = name;
		this.per = per;
	}

	public void display_data() {
		System.out.println(roll_no);
		System.out.println(name);
		System.out.println(per);
	}

}
