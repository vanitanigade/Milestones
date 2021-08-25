package logicalmilestone3.seriesforloop3;
//Q.4 Generate the Series 0 1 3 6 10 15 21 27 35..  0+1=1 1+2=3 3+3=6 6+4=10 10+5=15 15+6=21...

public class TriangularNo {

	public static void main(String[] args) {

		int a=0;

		for(int i=0; i<=10; i++) {
			a=a+i;
			System.out.print(a + " ");		//OR
			//System.out.print((i*(i+1))/2 + " ");
		}
	}

}
