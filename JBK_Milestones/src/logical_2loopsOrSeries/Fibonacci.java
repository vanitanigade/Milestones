package logical_2loopsOrSeries;
//0 1 1 2 3 5 8 13 21 34  //0+1=1 1+1=2 1+2=3 2+3=5 3+5=8 5+8=13.....

public class Fibonacci {

	public static void main(String[] args) {

		int num1=0;
		int num2=1;
		
		System.out.print(num1 + " " + num2 + " ");
		for(int i=0; i<=10; i++) {
			
			int num3= num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3 + " ");
		}
	}

}
