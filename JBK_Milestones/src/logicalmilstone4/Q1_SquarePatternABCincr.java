package logicalmilstone4;

public class Q1_SquarePatternABCincr {

	public static void main(String[] args) {

		int k=65;

		/*	for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)	{
				System.out.print((char)(k++) + " ");
			}		
			System.out.println();
		}
		 */
		for(int i=0; i<=24; i++) {	//A to Y -> 25

			if(i%5==0)	// 5 elements per row
				System.out.println();
			System.out.print((char)(i+k) + " ");	//0+65
		} 

	}

}
