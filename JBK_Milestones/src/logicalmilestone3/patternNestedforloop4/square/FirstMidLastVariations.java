package logicalmilestone3.patternNestedforloop4.square;

public class FirstMidLastVariations {

	public static void main(String[] args) {

			int k=1;

		for(int i=1; i<=3; i++) {
			for(int j=1; j<=9; j++){

				if(j>=4 && j<=6) {
					System.out.print("@ ");
				}else if(j==8 && i==2) {
					System.out.print("2 ");
				}
				else if(j>=7 && j<=9) {
					System.out.print("1 ");
				}else
					System.out.print(k++ + " ");		//OR k=k+1
			}
			System.out.println();

		} 
	/*	int k=1;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++){
				System.out.print(k++ + " ");			//OR k=k+1
			}
			System.out.println();
		}  
*/
	}

}
