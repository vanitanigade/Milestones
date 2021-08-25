package logicalprograms_2pattern;

public class Diamond_LeftAscendingDescending {
	
public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("  "); // 2 spaces // if 1 space deleted then it will convert into ascending triangle/pyramid program
			}
			for(int k=5; k>=i; k--) {
				System.out.print(k + " ");	//instead of k print any special character
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  "); // 2 spaces // if 1 space deleted then it will convert into ascending triangle/pyramid program
			}
			for(int k=5; k>=i; k--) {
				System.out.print("* ");	
			}
			System.out.println();
		}
	}


}
