package logicalmilestone3.patternNestedforloop4;

public class Right_IncrementByNo {
	
	public static void main(String[] args) {
		
		int num=1;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
			//	num=num+1;
				System.out.print(num++ + " ");			//OR num=num+1
				
			}
			System.out.println();
		}
	}
	

}
