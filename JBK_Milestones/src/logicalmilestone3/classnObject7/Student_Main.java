package logicalmilestone3.classnObject7;

public class Student_Main {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.accept_data(11, "abhi", 89.99f);
		
		Student s2 = new Student();
		s2.accept_data(12, "kriti", 45.99f);
		
		s1.display_data();
		s2.display_data();
	}

}
