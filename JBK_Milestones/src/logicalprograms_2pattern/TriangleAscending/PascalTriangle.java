package logicalprograms_2pattern.TriangleAscending;

public class PascalTriangle {

	public static void main(String[] args) {
		
		for(int i=0; i<=7; i++) {
			
			for(int j=7; j>i; j--) {
				System.out.print(" ");
			}
			int number = 1;
			for(int k=0; k<=i; k++) {
				System.out.print(number + " ");
				number = number * (i-k) / (k+1);
			}
			System.out.println();
		}
	}

}
