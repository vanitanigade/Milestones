package logicalmilestone3.classnObject7;
//2. W.A.java program create a class Employee [ emp_id, emp_name, age, salary].  
//Accept a Employee records and display it [use accept_data() and display_data() methods..].

public class Employee {
	
	int emp_id;
	String emp_name;
	int age;
	int salary;
	
	public void accept_data(int emp_id, String emp_name, int age, int salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.salary = salary;
	}

	public void display_data() {
		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(age);
		System.out.println(salary);
	}
}
