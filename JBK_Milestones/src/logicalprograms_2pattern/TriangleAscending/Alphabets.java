package logicalprograms_2pattern.TriangleAscending;

public class Alphabets {
	
public static void main(String[] args) {
		
	int a=65;
	
		for(int i=1; i<=6; i++) {
			for(int j=6; j>=i; j--) {
				System.out.print(" ");
			}
			int temp=1;
			for(int k=1; k<=i; k++) {
				System.out.print((char)(a-1 + temp) + " ");	//
				temp = temp * (i-k)/k;
			}
			System.out.println();
		}
	}

}
