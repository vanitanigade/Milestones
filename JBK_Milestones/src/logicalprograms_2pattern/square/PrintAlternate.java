package logicalprograms_2pattern.square;

public class PrintAlternate {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				if(j==2 || j==4)			//OR if(j%2==0) use this if want to print alternate for max lines/columns
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(j%2==0)					//OR if (j==2 || j==4)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
