package logicalmilestone3.inheritance8.ques4;

public class Rectangle implements Shape{

	@Override
	public void area(int x, int y) {

		System.out.println("are of Rectangle: " + (x*y));
	}

	@Override
	public void volume(int x, int y, int z) {

		System.out.println("perimeter of rectangle: " + (2*(x+y)));
	}

	
	}
