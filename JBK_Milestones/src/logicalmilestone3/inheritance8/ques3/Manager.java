package logicalmilestone3.inheritance8.ques3;
//3. Define an Employee class with suitable attributes having getSalary() method, which returns salary withdrawn by a particular employee. Write a 
//class Manager which extends a class Employee, override the getSalary() method, which will return salary of manager by adding Different HRA and DA.

public class Manager extends Employee{

	public Manager(double basic_sal) {
		super(basic_sal);
	}
	
	double getSalary() {
		da=basic_sal*0.25;
		hra=basic_sal*0.20;
		gross_sal = basic_sal + hra + da;
		return gross_sal;
		
	
	}	

}
