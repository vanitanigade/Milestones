package logicalprograms_2pattern.rightDescending;

public class PrintVerticalAlphabets_j {
	public static void main(String[] args) {
		
		int alphabet = 65;
	
	for(int i=5; i>=0; i--) {
		for(int j=0; j<=i; j++) {
			System.out.print((char)(alphabet+j)+" ");
		}
		System.out.println();
	}
  }
}
