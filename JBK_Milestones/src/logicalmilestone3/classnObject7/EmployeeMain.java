package logicalmilestone3.classnObject7;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.accept_data(101, "abhi", 21, 15000);
		e1.display_data();
		
		Employee e2 = new Employee();
		e2.accept_data(102, "samu", 25, 25000);
		e2.display_data();

		
	}

}
