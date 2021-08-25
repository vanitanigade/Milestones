package logicalmilestone3.classnObject7;
//3. W.A.java program create a class Student details which having roll_no, name, percentage. 
//Accept 3 students records and display it.(use Constructor).

public class Student1 {

	int roll_no;
	String name;
	float per;

	public Student1(int roll_no, String name, float per) {

		this.roll_no = roll_no;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student1 [roll_no=" + roll_no + ", name=" + name + ", per=" + per + "]";
	}

}
