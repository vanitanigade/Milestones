package logicalmilestone3.inheritance8.ques4;

public class Circle implements Shape{

	double PI = 3.14;
	
	@Override
	public void area(int x, int y) {
		System.out.println("area of Circle: " + (PI*x*x));
		
	}

	@Override
	public void volume(int x, int y, int z) {
		System.out.println("Circumferance of Circle: " + (2*PI*x));
	}

	
}
