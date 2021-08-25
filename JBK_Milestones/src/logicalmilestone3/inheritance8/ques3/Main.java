package logicalmilestone3.inheritance8.ques3;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee(10000);
		System.out.println(	e.getSalary());
	
		Manager m = new Manager(10000);
		System.out.println(m.getSalary());

	}

}
