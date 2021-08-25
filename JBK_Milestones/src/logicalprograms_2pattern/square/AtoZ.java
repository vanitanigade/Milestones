package logicalprograms_2pattern.square;

public class AtoZ {

	public static void main(String[] args) {

		int k=65;
		
		for(int i = 0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				System.out.print((char)k++ + " ");
			}
			System.out.println();
		}
	}

}
