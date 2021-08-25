package logicalmilstone4;

public class Q3_RightAscABC {

	public static void main(String[] args) {

		int k=65;
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(k+i+j) + " ");
			}
			System.out.println();
		}
	}

}
