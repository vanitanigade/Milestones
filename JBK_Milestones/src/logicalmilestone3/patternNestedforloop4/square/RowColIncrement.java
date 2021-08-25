package logicalmilestone3.patternNestedforloop4.square;

public class RowColIncrement {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=3; i++) {
			for(int j=i; j<=i+4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
