package logicalprograms_2pattern.square;

public class Middle3RowsColumns {
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=9; j++) {
				if (j==4 || j==5 || j== 6)
					System.out.print("@ ");
				else 
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
