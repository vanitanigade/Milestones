package logicalmilestone3.inheritance8.ques4;

public class Main {

	public static void main(String[] args) {

		Shape c = new Circle();
		Shape r = new Rectangle();
		Shape t = new Triangle();
		
		c.area(2, 0);
		c.volume(2, 0, 0);
		
		r.area(3, 4);
		r.volume(3, 4, 0);
		
		t.area(5, 10);
		t.volume(5, 6, 7);
		
		
	}

}
