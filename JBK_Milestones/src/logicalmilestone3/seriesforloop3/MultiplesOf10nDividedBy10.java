package logicalmilestone3.seriesforloop3;

public class MultiplesOf10nDividedBy10 {

	public static void main(String[] args) {

		for(int i=1; i<=1000; i=i*10) {
			System.out.print(i + " ");
		}
		for(int j=100; j>=1; j=j/10) {
			System.out.print(j + " ");
		}
	}

}
