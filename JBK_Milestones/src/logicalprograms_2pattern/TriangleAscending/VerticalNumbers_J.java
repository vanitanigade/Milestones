package logicalprograms_2pattern.TriangleAscending;

public class VerticalNumbers_J {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--) {
				System.out.print("* ");	//if space after star is removed then it will convert into left ascending program
			}
			System.out.println();
		}
	}
}
