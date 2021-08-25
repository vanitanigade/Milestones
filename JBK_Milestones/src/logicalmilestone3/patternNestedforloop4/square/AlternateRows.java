package logicalmilestone3.patternNestedforloop4.square;

public class AlternateRows {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				if(i==2 || i==4)
					System.out.print("@");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

}
