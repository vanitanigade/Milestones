package logicalprograms_2pattern.leftDescending;

public class LeftDescendingNumbers {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");  // 2 spaces // if 1 space deleted then it will convert into descending triangle/pyramid program
			}
			for(int k=5; k>=i; k--) {
				System.out.print(k + " ");	//instead of k print any special character
			}
			System.out.println();
		}
		System.out.println("=================");

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");  // 2 spaces // if 1 space deleted then it will convert into descending triangle/pyramid program
			}
			for(int k=i; k<=5; k++) {
				System.out.print(k + " ");	//instead of k print any special character
			}
			System.out.println();
		}
	}
}
