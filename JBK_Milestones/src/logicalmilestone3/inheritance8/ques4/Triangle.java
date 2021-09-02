package logicalmilestone3.inheritance8.ques4;

public class Triangle implements Shape{

	@Override
	public void area(int x, int y) {

		System.out.println("are of Triangle: " + (0.5*(x*y)));
	}

	@Override
	public void volume(int x, int y, int z) {

		System.out.println("perimeter of Triangle: " + (x+y+z));
	}

}
