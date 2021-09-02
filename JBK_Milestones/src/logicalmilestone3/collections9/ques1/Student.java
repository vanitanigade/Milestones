package logicalmilestone3.collections9.ques1;
// Write a java program to read n Students names from user, store them into the ArrayList collection. Display the names in Ascending order.

public class Student implements Comparable<Student>{

	String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

	
	
	
		
		
		
	

}
