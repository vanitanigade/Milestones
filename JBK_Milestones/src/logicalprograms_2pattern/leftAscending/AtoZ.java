package logicalprograms_2pattern.leftAscending;

public class AtoZ {
	
	public static void main(String[] args) {

		int k=65;
		
	/*	for(int i = 0; i<=6; i++) {						//rowise
			for(int j=0; j<=i; j++) {
				System.out.print((char)k++ + " ");
			}
			System.out.println();
		}
*/														//columnwise
		for(int i = 0; i<=5; i++) {
			int temp=i;

			for(int j=i; j>=0; j--) {
				System.out.print((char)(k + temp) + " ");
				temp=temp+5;
			}
			System.out.println();
		}
		
	}
}
