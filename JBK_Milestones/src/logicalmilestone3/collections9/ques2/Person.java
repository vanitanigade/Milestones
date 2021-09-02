package logicalmilestone3.collections9.ques2;
// Write a java program to read n String names from user, store them into the ArrayList collection. And iterate it .

public class  Person implements Comparable<Person>{
	
	String name;
	
	Person(String name){
		this.name= name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
	
	


	

}
