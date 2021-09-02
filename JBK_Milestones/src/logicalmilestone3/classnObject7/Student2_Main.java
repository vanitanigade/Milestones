package logicalmilestone3.classnObject7;

public class Student2_Main {

	public static void main(String[] args) {

		int sub1[]= {60,70,75,80,85};
		int sub2[] = {78,56,95,45,89};
		
		Student2 s1 = new Student2(101,"abhi", sub1);
		Student2 s2 = new Student2(102,"krish", sub2);
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);		//OR
		System.out.println("====================================");
		s1.display();		
		s2.display();				
		
	}

}
