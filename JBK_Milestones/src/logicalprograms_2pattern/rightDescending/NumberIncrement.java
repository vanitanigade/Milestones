package logicalprograms_2pattern.rightDescending;

public class NumberIncrement {

	public static void main(String[] args) {

		int num=0;
		
		for(int i=4; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				num=num+1;
				System.out.print(num+ " ");
			}
			System.out.println();
		}
	}

}
