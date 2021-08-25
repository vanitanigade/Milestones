package logicalmilestone3.classnObject7;
//3. W.A.java program create a class Student details which having roll_no, name, percentage. 
//Accept 3 students records and display it.(use Constructor).

public class Student1_Main {

	public static void main(String[] args) {
		
		Student1 s1= new Student1(11,"abhi",99);
		Student1 s2 = new Student1(12,"rocky",78.55f);
		Student1 s3 = new Student1(13,"kirit",65.88f);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
