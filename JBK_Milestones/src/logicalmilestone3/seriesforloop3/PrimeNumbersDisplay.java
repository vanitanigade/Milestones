package logicalmilestone3.seriesforloop3;
//a number that is divisible only by itself and 1

public class PrimeNumbersDisplay {

	public static void main(String[] args) {

		for(int i=2;i<=100; i++) {

			int count=0;
			for(int j=1;j<=i;j++) {

				if(i%j==0)
					count=count+1;     				//OR count++ 
			}
			if(count==2)
				System.out.print(i+"  ");     
		}
	}

}
