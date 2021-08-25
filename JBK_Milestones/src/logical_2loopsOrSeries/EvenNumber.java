package logical_2loopsOrSeries;

public class EvenNumber {

	public static void main(String[] args) {

		for(int i=2; i<=20; i++) {
			if(i%2==0)
				System.out.print(i + " ");
			
		}   //OR
		
		System.out.println();
		
		for(int i=2; i<=20; i=i+2) {
			System.out.print(i + " ");
			if(i==8)
				System.out.print("100 ");
		}
	}

}
