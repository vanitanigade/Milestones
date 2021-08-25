package logicalprograms_2pattern.rightDescending;

public class VerticalNumbers_j {

	public static void main(String[] args) {

		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");		//instead of j user can add any special character
			}
			System.out.println();
		}
	}

}
