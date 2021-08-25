package logicalmilestone3.patternNestedforloop4.square;

public class IncreaseNoByRows {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);			// if j is written then columns will be printed
			}
			System.out.println();
		}
	}
}
